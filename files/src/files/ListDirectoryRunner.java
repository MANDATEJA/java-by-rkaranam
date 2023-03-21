package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ListDirectoryRunner {

	public static void main(String[] args) throws IOException {
		Path rootDir = Paths.get(".");
//		Files.list(rootDir).forEach(System.out::println);

		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
//		Files.walk(rootDir, 4).filter(predicate).forEach(System.out::println);

//		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".java");

		BiPredicate<Path, BasicFileAttributes> dirMatcher = (path, attributes) -> attributes.isDirectory() ;
		Files.find(rootDir, 4, dirMatcher ).forEach(System.out::println);

	}

}
