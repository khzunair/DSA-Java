package filehandling;

import java.io.FileWriter;
import java.io.IOException;


public class WriteAFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("file.txt");
			myWriter.write("File Writing can be tricky but I'ld be Fun!");
			
//			When we are done with the writing we should close the file
			myWriter.close();
			
			System.out.println("Successfully written on the File!");
		}
		
		catch(IOException e){
			System.out.println("Some Error Occured!");
			e.printStackTrace();
			
		}
	}

}
