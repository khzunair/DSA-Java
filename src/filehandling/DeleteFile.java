package filehandling;
import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File myObj = new File("File.txt");
		
		if(myObj.delete()) {
			System.out.println("File Deleted Successfully");
		}
		
		else {
			System.out.println("Failed to delete File.");
		}

	}

}
