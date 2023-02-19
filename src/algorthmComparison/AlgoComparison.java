package algorthmComparison;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class AlgoComparison {
	
//	to generate random data and save a file
	public void randomNumbersGenerator(int sizeOfValues) throws IOException {
		
		File file = new File("random.txt");
		
		if (file.createNewFile()) {
			System.out.println("File Created Successfully path: "+ file.getAbsolutePath()+ " as "+ file.getName());
		}else {
			System.out.println("File already exists and initialized! "+ " as "+ file.getName());
		}
		
        FileWriter fw = new FileWriter("random.txt");  
		
		int count = 0;
		while(count < sizeOfValues) {
			int num = (int) (Math.random()*100);
		  	 fw.write(num +"\n");
//			System.out.println(num);
			count++ ;
		}
		System.out.println("Random data generated and saved in file " + file.getName());
		fw.close();
		
	}
	
//	Reading data and storing in an array
	public int[] readRandomFile() throws IOException {
		
//		open file (if not created then create one)
//		File file = new File("random.txt");
		int arraySize = 0;
		
		BufferedReader br= new BufferedReader(new FileReader("random.txt"));

		
//		This array determines the number of lines in the file;
		while ( br.readLine() != null) {
			arraySize++ ;
		}
//		br.close();

//		System.out.println(arraySize);
		
//		Now save the data present in the file into the array
		String st;
		int[] StoreInArray = new int[arraySize];
		try (BufferedReader br1 = new BufferedReader(new FileReader("random.txt"))) {
			for (int i = 0; i<arraySize;i++) {
				st = br1.readLine();
				StoreInArray[i] = Integer.parseInt(st);	
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		br.close();
		
//		returns the array from reading the file.
		return StoreInArray;
		
	}
	
//	creating Excel File 
	
	public void excelFileInitializaton() throws IOException {
		File file = new File("statistics.csv");
		
		if (file.createNewFile()) {
			System.out.println("File Created Successfully path: "+ file.getAbsolutePath()+" as "+ file.getName());
		}else {
			System.out.println("File already exists and initialized! "+" as "+ file.getName());
		}
		
		  FileWriter fw = new FileWriter("statistics.csv");  
		  fw.write("ALGORITHM,DATA LENGTH,TIME DIFFERENCE ,MEAN");
		  fw.close();
		
	}
	
	
	
//	traverse Record
	public void traverse() throws IOException {
	int[] tempArray =	readRandomFile();
	System.out.println(Arrays.toString(tempArray));
	}
	
	
//	Bubble Sort
	public void bubbleSort(int numberOfRecords) throws IOException {
		
		File file = new File("random.txt");
		
		if (file.createNewFile()) {
			System.out.println("File Created Successfully path: "+ file.getAbsolutePath()+ " as "+ file.getName());
		}else {
			System.out.println("File already exists and initialized! "+ " as "+ file.getName());
		}
		
        FileWriter fw = new FileWriter("random.txt");  
		
		int count = 0;
		while(count < numberOfRecords) {
			int num = (int) (Math.random()*100);
		  	 fw.write(num +"\n");
//			System.out.println(num);
			count++ ;
		}
		System.out.println("Random data generated and saved in file " + file.getName());
		fw.close();
		
		
		int[] tempArray =	readRandomFile();
		
		int n = tempArray.length -1 ;
		
//		Bubble Sorting start-----------------------------------------------------------------
		int counta = 5;
		long timeTaken=0;
		
		while(counta>0) {
			
		long start = System.currentTimeMillis();

		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j<n-i ; j++) {
				if(tempArray[j] > tempArray[j+1]) {
					int temp = tempArray[j];
					tempArray[j] = tempArray[j+1];
					tempArray[j+1] = temp;
				}
			}
			
		}
	    long end = System.currentTimeMillis(); 
	    
	    timeTaken = end - start + timeTaken;
//	     System.out.println(timeTaken);
//	     System.out.println(timeTaken+"jell");
	     
		counta--;
		}
		long meanTimeOfAlgoritm = timeTaken/5;
		System.out.println(meanTimeOfAlgoritm+" (Mean)");
		
//		Bubble Sorting ends ----------------------------------------------------------------- 
 
	    		 
	        BufferedWriter writer = new BufferedWriter(new FileWriter("statistics.csv",true));

	        writer.append("\nBUBBLE SORT,"+numberOfRecords+","+timeTaken+","+meanTimeOfAlgoritm);

	        writer.close();
	        System.out.println("Bubble Sorted");
		

	}
	
	
public void selectionSort(int numberOfRecords) throws IOException {
		
		File file = new File("random.txt");
		
		if (file.createNewFile()) {
			System.out.println("File Created Successfully path: "+ file.getAbsolutePath()+ " as "+ file.getName());
		}else {
			System.out.println("File already exists and initialized! "+ " as "+ file.getName());
		}
		
        FileWriter fw = new FileWriter("random.txt");  
		
		int count = 0;
		while(count < numberOfRecords) {
			int num = (int) (Math.random()*100);
		  	 fw.write(num +"\n");
//			System.out.println(num);
			count++ ;
		}
		System.out.println("Random data generated and saved in file " + file.getName());
		fw.close();
		
		
		int[] tempArray =	readRandomFile();
		
		
//		Selection Sorting start-----------------------------------------------------------------
		int counta = 5;
		long timeTaken=0;
		
		while(counta>0) {
			
		long start = System.currentTimeMillis();

		for(int i=0; i<tempArray.length ; i++) {
			int minIndex = i;
			for(int j=i+1 ; j<tempArray.length ; j++) {
				if(tempArray[j]<tempArray[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {				
				int temp = tempArray[minIndex];
				tempArray[minIndex] = tempArray[i];
				tempArray[i] = temp;
			}
			}
		
	    long end = System.currentTimeMillis(); 
	    
	    timeTaken = end - start + timeTaken;
//	     System.out.println(timeTaken);
//	     System.out.println(timeTaken+"jell");
	     
		counta--;
		}
		long meanTimeOfAlgoritm = timeTaken/5;
		System.out.println(meanTimeOfAlgoritm+" (Mean)");
		
//		Selection Sorting ends ----------------------------------------------------------------- 
 
	    		 
	        BufferedWriter writer = new BufferedWriter(new FileWriter("statistics.csv",true));

	        writer.append("\nSELECTION SORT,"+numberOfRecords+","+timeTaken+","+meanTimeOfAlgoritm);

	        writer.close();
	        System.out.println("Selection Sorted");
		

	}

public void insertionSort(int numberOfRecords) throws IOException {
	
	File file = new File("random.txt");
	
	if (file.createNewFile()) {
		System.out.println("File Created Successfully path: "+ file.getAbsolutePath()+ " as "+ file.getName());
	}else {
		System.out.println("File already exists and initialized! "+ " as "+ file.getName());
	}
	
    FileWriter fw = new FileWriter("random.txt");  
	
	int count = 0;
	while(count < numberOfRecords) {
		int num = (int) (Math.random()*100);
	  	 fw.write(num +"\n");
//		System.out.println(num);
		count++ ;
	}
	System.out.println("Random data generated and saved in file " + file.getName());
	fw.close();
	
	
	int[] array =	readRandomFile();
	
	
//	Insertion Sorting start-----------------------------------------------------------------
	int counta = 5;
	long timeTaken=0;
	
	while(counta>0) {
		
	long start = System.currentTimeMillis();

	for(int i = 1; i<array.length; i++) {
		int temp = array[i];
		int j = i;
		
		while(j>0 && array[j-1]> temp) {
			array[j] = array[j-1];
			j--;
			
		}
		array[j] = temp; 	
	}
	
    long end = System.currentTimeMillis(); 
    
    timeTaken = end - start + timeTaken;
//     System.out.println(timeTaken);
//     System.out.println(timeTaken+"jell");
     
	counta--;
	}
	long meanTimeOfAlgoritm = timeTaken/5;
	System.out.println(meanTimeOfAlgoritm+" (Mean)");
	
//	Insertion Sorting ends ----------------------------------------------------------------- 

    		 
        BufferedWriter writer = new BufferedWriter(new FileWriter("statistics.csv",true));

        writer.append("\nINSERTION SORT,"+numberOfRecords+","+timeTaken+","+meanTimeOfAlgoritm);

        writer.close();
        System.out.println("Insertion Sorted");
	

}
	
	
	
	
	
	public static void main(String args[]) throws IOException {
		AlgoComparison object = new AlgoComparison();
//		object.randomNumbersGenerator(150);
//		object.traverse();
//		object.excelFileInitializaton();
//		object.bubbleSort(20000);
//		object.selectionSort(20000);
		object.insertionSort(20000);

		

//		
//	      System.out.println("Elapsed Time in milli seconds: "+ (end2-start2));


	}

}
