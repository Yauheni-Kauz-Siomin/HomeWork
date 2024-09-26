package test.home_work_6;

import home_work_6.utils.*;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchEngineTest {

    @org.junit.Test
    @DisplayName("Тест для EasySearch")
    public void test1() {
        ISearchEngine searchEngine = new EasySearch();
        String text = "Пришел, чтобы поздароваться и сказать привет, а когда пришел, то слова привет так и не сказал!";

        assertEquals(2, searchEngine.search(text, "Пришел")); // будет Expected :2 , Actual   :1, т.к. поисковик работает с учетом регистра
        assertEquals(1, searchEngine.search(text, "сказать"));
        assertEquals(2, searchEngine.search(text, "привет"));
        assertEquals(0, searchEngine.search(text, "редис"));
    }

    @org.junit.Test
    @DisplayName("Тест для RegExSearch")
    public void test2() {
        ISearchEngine searchEngine = new RegExSearch();
        String text = "Пришел, чтобы поздароваться и сказать привет, а когда пришел, то слова привет так и не сказал!";

        assertEquals(2, searchEngine.search(text, "Пришел")); // будет Expected :2 , Actual   :1, т.к. поисковик работает с учетом регистра
        assertEquals(1, searchEngine.search(text, "сказать"));
        assertEquals(2, searchEngine.search(text, "привет"));
        assertEquals(0, searchEngine.search(text, "редис"));
    }

    @org.junit.Test
    @DisplayName("Тест для SearchEnginePunctuationNormalizer")
    public void test3() {
        ISearchEngine searchEngine = new SearchEnginePunctuationNormalizer(new RegExSearch());
        String text = "Пришел, чтобы поздароваться и сказать привет, а когда пришел, то слова привет так и не сказал!";
        assertEquals(1, searchEngine.search(text, "Пришел"));
        assertEquals(1, searchEngine.search(text, "сказать"));
        assertEquals(2, searchEngine.search(text, "привет"));
        assertEquals(0, searchEngine.search(text, "редис"));

    }

    @org.junit.Test
    @DisplayName("Тест для CaseInsensitiveSearchEngine")
    public void test4() {
        ISearchEngine searchEngine = new CaseInsensitiveSearch(new EasySearch());
        String text = "Пришел, чтобы поздароваться и сказать привет, а когда пришел, то слова привет так и не сказал!";

        assertEquals(2, searchEngine.search(text, "ПРИШЕЛ"));
        assertEquals(1, searchEngine.search(text, "СКАЗАТЬ"));
        assertEquals(2, searchEngine.search(text, "привет"));
        assertEquals(0, searchEngine.search(text, "редис"));
    }

}
