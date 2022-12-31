package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
	
	public static void main(String[] args) {
		
		try {
			
		File myObj = new File("file.txt");
		
//		if you want file from a custom directory : -
//		File myObj = new File("C:\\Users\\zunair\\documents\\myProjects\\file.txt");

		
			if (myObj.createNewFile()) {
				System.out.println("File Created"+" name: "+ myObj.getName());
			}
			else {
				System.out.println("File Already Exsists!");
			}
		}	catch(IOException e){
			
			System.out.println("Error occoured ");
			e.printStackTrace();
		}
			
//		Same operations can be performed to delete a folder.
	}

}
