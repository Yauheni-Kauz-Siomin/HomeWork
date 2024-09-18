package home_work_6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {


        String book = new String(Files.readAllBytes(new File("Война и мир_книга.txt").toPath()));

        Set<String> allWords = new HashSet<>(Arrays.asList(book.split("[\\p{Punct}\\s]+")));

        System.out.println("Количество слов: " +allWords.size());


    }
}
