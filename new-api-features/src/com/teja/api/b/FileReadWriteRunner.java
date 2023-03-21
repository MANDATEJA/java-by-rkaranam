package com.teja.api.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./resources/sample.txt");
		String fileContents = Files.readString(path);
		System.out.println(fileContents);
		String newFileContent = fileContents.replace("Line", "Lines");
		Path newFilePath = Paths.get("./resources/new-sample-file.txt");
		Files.writeString(newFilePath, newFileContent);
	}
}
