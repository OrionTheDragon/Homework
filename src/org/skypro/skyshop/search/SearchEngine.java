package org.skypro.skyshop.search;

import java.util.LinkedList;
import java.util.List;
import org.skypro.skyshop.exceptions.BestResultNotFound;

public class SearchEngine {
    private final List<Searchable> searchables = new LinkedList<>();

    public void add(Searchable searchable) {
        searchables.add(searchable);
    }

    public List<Searchable> search(String query) {
        List<Searchable> results = new LinkedList<>();
        for (Searchable searchable : searchables) {
            if (searchable.getSearchTerm().contains(query)) {
                results.add(searchable);
            }
        }
        return results;
    }

    public Searchable findBestMatch(String search) throws BestResultNotFound {
        Searchable bestMatch = null;
        int maxCount = 0;

        for (Searchable searchable : searchables) {
            String term = searchable.getSearchTerm();
            int count = 0;
            int index = 0;
            int substringIndex = term.indexOf(search, index);

            while (substringIndex != -1) {
                count++;
                index = substringIndex + search.length();
                substringIndex = term.indexOf(search, index);
            }

            if (count > maxCount) {
                maxCount = count;
                bestMatch = searchable;
            }
        }

        if (bestMatch == null) {
            throw new BestResultNotFound(search);
        }

        return bestMatch;
    }
}
