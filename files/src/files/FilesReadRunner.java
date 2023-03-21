package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesReadRunner {

	public static void main(String[] args) throws IOException {
		Path textFile = Paths.get("./resources/data.txt");
//		List<String> readAllLines = Files.readAllLines(textFile);
//		System.out.println(readAllLines);

		Files.lines(textFile).map(String::toLowerCase).filter(str -> str.contains("vi")).forEach(System.out::println);

	}

}
