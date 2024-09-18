package home_work_6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


/*        // 2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set
        Т.к. класс HashSet реализует интерфейс Set, он может хранить только уникальные значения,
        таким образом можно говорить о количестве уникальных слов в книге*/

        String filePath = "Война и мир_книга.txt";

        String book = new String(Files.readAllBytes(new File(filePath).toPath()));

        Set<String> allWords = new HashSet<>(Arrays.asList(book.split("[\\p{Punct}\\s]+")));

        List<String> words = new ArrayList<>(Arrays.asList(book.split("[\\p{Punct}\\s]+"))); // для сравнения

        System.out.println("Количество слов (уникальных): " +allWords.size());
        System.out.println("Количество всего слов в книге: " +words.size());

    }



}
