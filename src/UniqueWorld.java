import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWorld {
    private Set<String> wordsSet;

    public UniqueWorld(List<String> words) {
        wordsSet = new TreeSet<>(new SymbolAscendingComparator());
        wordsSet.addAll(words);
    }

    public Set<String> getWordsSet() {
        return wordsSet;
    }
}