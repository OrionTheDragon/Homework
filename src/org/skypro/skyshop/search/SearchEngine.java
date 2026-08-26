package org.skypro.skyshop.search;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import org.skypro.skyshop.exceptions.BestResultNotFound;

public class SearchEngine {
    private final Set<Searchable> searchables = new HashSet<>();

    public void add(Searchable searchable) {
        searchables.add(searchable);
    }

    public Set<Searchable> search(String query) {
        Set<Searchable> results = new TreeSet<>((first, second) -> {
            int result = Integer.compare(second.getName().length(), first.getName().length());
            if (result == 0) {
                return first.getName().compareTo(second.getName());
            }
            return result;
        });
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
