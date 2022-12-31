package filehandling;

import java.io.IOException;

public class ForCsvMain {

	public static void main(String[] args) throws IOException {

		ForCsv object = new ForCsv();
//		object.traverse();
//		object.delete(2, 2);
		object.search("hell");
//		object.insert(0, 0, "hello");
		object.insertNewRecord("hell","bell","yell");
	}

}
