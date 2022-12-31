package filehandling;
import java.io.File;

//FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream

public class FileInformation {
	public static void main(String[] args) {
		File myFile = new File("file.txt");
		if(myFile.exists()) {
			System.out.println("File-name  : "+ myFile.getName());
			System.out.println("File-path  : "+ myFile.getAbsolutePath());
			System.out.println("Writeable? : "+ myFile.canWrite());
			System.out.println("Readable ? : "+ myFile.canRead());
			System.out.println("file-size-in-bytes: "+ myFile.length());
			
		}
		
		else {
			System.out.println("File Does not Exsists");
		}
	}

}
