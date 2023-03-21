package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		Path fileToWrite = Paths.get("./resources/write-to-file.txt");
		List<String> lines = List.of("First line", "Teja is in search of higher power", "Meaning of life");

		Files.write(fileToWrite, lines);
	}

}
