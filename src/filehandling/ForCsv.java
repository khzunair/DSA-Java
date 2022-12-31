package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class ForCsv {
	public String[][] initializeFile() throws IOException {
		File file = new File("csv.txt");
		
		if(file.createNewFile() ){
			System.out.println("File Created & initialized successfully at "+ file.getAbsolutePath());
		}
		else {
			System.out.println("File initialized successfully at "+ file.getAbsolutePath());
		}

		
		BufferedReader br= new BufferedReader(new FileReader(file));
		int rows = 0;
		int columns = 3;
		
//		This loop determines the number of rows in the file as columns are fields that are pre-decided while the design of file according to data requirements
		while ( br.readLine() != null) {
			rows++ ;
		}

		br.close();

		String line= "";
			
			BufferedReader bfr = new BufferedReader(new FileReader(file));
			
		String[][] tempArray = new String[rows][columns];

				for (int i=0;i<rows;i++) {
					line = bfr.readLine();
					String[] values = line.split(",");
				for(int j =0; j<columns;j++) {
					tempArray[i][j] = values[j];
				}
			}
				
//				System.out.println(tempArray[1][0]);
				
			bfr.close();
			

		return tempArray;
	}
	
//	Traverse
//	Traversal Method 
	public String traverse() throws IOException {
		String[][] array = initializeFile();
		System.out.println( "Traverse method called "+ Arrays.deepToString(array));
		return Arrays.deepToString(array);
	}
	
//	Search(something wrong)
	public String search(String valueToBeSearched) throws IOException {
		String[][] array = initializeFile();
		int found=0;
		for (int i=0;i<array.length;i++) {
			for(int j=0 ;j<array[0].length;j++) {
				if((array[i][j]).contains(valueToBeSearched)) {
//					System.out.println("Found");
					System.out.println("found at index"+"["+i+"]"+"["+j+"]");
					found++;
				}
			}
		}
		System.out.println(found+" results found");
		return (found+" results found");

	}
	
//	Delete Method
	public String delete(int row, int column) throws IOException {
		String[][] array = initializeFile();
		if((row > array.length)&&(column>array[0].length)) {
			System.out.println("Index does not exists!");
//			return index+" index does not exist";
		}
		else {
			array[row][column] ="null" ;
//			System.out.println(array[row][column]);
			
     		FileWriter fw = new FileWriter("csv.txt");
       	 for(int i =0 ; i<array.length;i++) {
       		 for(int j=0; j<array[0].length;j++) {

       				 fw.write(array[i][j]+"");
       			 
       		 }
       		fw.write("\n");
       	 }
       	 System.out.println("deleted Successfully");
       	 fw.close();
		}
		return "Deleted SuccessFully at index "+"["+row+"]"+"["+column+"]";
		
			
			
	}

//		Insert in one cell
	public void insert(int row, int column,String valueToBeInserted) throws IOException {
		String[][] array = initializeFile();
		if(!array[row][column].contains("null")) {
			System.out.println("Value is already filled!");
			System.out.println("First delete it");
		}
		else {
			array[row][column] = valueToBeInserted;
			
     		FileWriter fw = new FileWriter("csv.txt");
          	 for(int i =0 ; i<array.length;i++) {
          		 for(int j=0; j<array[0].length;j++) {

          				 fw.write(array[i][j]+"");

          			 
          		 }
          		fw.write("\n");
          	 
		}
          	 fw.close();

		
	}

	}
	
//	Insert a new record 
	
	public void insertNewRecord(String first,String second,String third) throws IOException {
		String[][] array = initializeFile();

//		System.out.println(array[0].length);
		
 		FileWriter fw = new FileWriter("csv.txt");
     	 for(int i =0 ; i<array.length;i++) {
     		 for(int j=0; j<array[0].length;j++) {

     				 fw.write(array[i][j]+",");

     			 
     		 }
     		fw.write("\n");
		
	}
     	 fw.write(first+","+second+","+third);
     	fw.close();
	}
     	 
//	---------------------Class brac-----------------------
	}
	
//---------------------Class brac-----------------------


