package home_work_6;

import home_work_6.utils.EasySearch;
import home_work_6.utils.ISearchEngine;
import home_work_6.utils.RegExSearch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MainSearchEngine {
    public static void main(String[] args) throws IOException {

        String filePath = "Война и мир_книга.txt";
        String book = new String(Files.readAllBytes(new File(filePath).toPath()));

        ISearchEngine iSearchEngine = new EasySearch();
        System.out.println("война - " + iSearchEngine.search(book," война "));
        System.out.println("и - " + iSearchEngine.search(book, " и "));
        System.out.println("мир - " + iSearchEngine.search(book, " мир "));

        ISearchEngine iSearchEngine1 = new RegExSearch();
        System.out.println("война - " + iSearchEngine1.search(book," война "));
        System.out.println("и - " + iSearchEngine1.search(book, " и "));
        System.out.println("мир - " + iSearchEngine1.search(book, " мир "));

    }

}
