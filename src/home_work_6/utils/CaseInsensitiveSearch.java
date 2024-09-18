package home_work_6.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaseInsensitiveSearch implements ISearchEngine {

    private final ISearchEngine searchEngine;

    public CaseInsensitiveSearch(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }


    @Override
    public long search(String text, String word) {

        String lowerCaseText = text.toLowerCase();
        String lowerCaseWord = word.toLowerCase();

        if (searchEngine instanceof RegExSearch) {
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(lowerCaseWord) + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(lowerCaseText);
            long count = 0;
            while (matcher.find()) {
                count++;
            }
            return count;
        } else {
            return searchEngine.search(lowerCaseText, lowerCaseWord);
        }
    }
}
