package org.skypro.skyshop.search;

import org.skypro.skyshop.exceptions.BestResultNotFound;

public class SearchEngine {
    private final Searchable[] searchables;

    public SearchEngine(int capacity) {
        this.searchables = new Searchable[capacity];
    }

    public void add(Searchable searchable) {
        for (int i = 0; i < searchables.length; i++) {
            if (searchables[i] == null) {
                searchables[i] = searchable;
                return;
            }
        }
    }

    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int resultCount = 0;
        for (Searchable searchable : searchables) {
            if (searchable != null && searchable.getSearchTerm().contains(query)) {
                results[resultCount++] = searchable;
                if (resultCount == 5) {
                    break;
                }
            }
        }
        return results;
    }

    public Searchable findBestMatch(String search) throws BestResultNotFound {
        Searchable bestMatch = null;
        int maxCount = 0;

        for (Searchable searchable : searchables) {
            if (searchable == null) continue;

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
