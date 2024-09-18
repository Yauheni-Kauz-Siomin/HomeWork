package home_work_6;

import home_work_6.utils.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MainSearchEngine {
    public static void main(String[] args) throws IOException {

        String filePath = "Война и мир_книга.txt";
        String book = new String(Files.readAllBytes(new File(filePath).toPath()));

        System.out.println("EasySearch");
        ISearchEngine iSearchEngine = new EasySearch();
        System.out.println("война - " + iSearchEngine.search(book, " война "));
        System.out.println("и - " + iSearchEngine.search(book, " и "));
        System.out.println("мир - " + iSearchEngine.search(book, " мир "));


        System.out.println("RegExSearch");
        ISearchEngine iSearchEngine1 = new RegExSearch();
        System.out.println("война - " + iSearchEngine1.search(book, " война "));
        System.out.println("и - " + iSearchEngine1.search(book, " и "));
        System.out.println("мир - " + iSearchEngine1.search(book, " мир "));


        System.out.println("CaseInsensitiveSearch");
        ISearchEngine iSearchEngine2 = new CaseInsensitiveSearch(new EasySearch());
        System.out.println("война - " + iSearchEngine2.search(book, " война "));
        System.out.println("и - " + iSearchEngine2.search(book, " и "));
        System.out.println("мир - " + iSearchEngine2.search(book, " мир "));

    }

}
