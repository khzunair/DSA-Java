package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadingFromFile {

	public static void main(String[] args) {
		try {
			File myObj = new File("file.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Something went wrong");
			e.printStackTrace();
			
		}
	}
}
