import java.util.*;

public class RepeatWord {
    private Map<String, Integer> wordsMap;

    public RepeatWord(List<String> words) {
        wordsMap = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            String temp = words.get(i);
            if (!wordsMap.containsKey(temp)) {
                wordsMap.put(temp, 1);
            } else {
                wordsMap.put(temp, wordsMap.get(temp) + 1);
            }
        }
    }

    public int countWorld(String word) throws NotFoundWordException {
        int count = 0;
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getKey().equals(word)) {
                count = entry.getValue();
            }
            if (entry.getValue() == 0) {
                throw new NotFoundWordException("Слово «" + word + "» нет в тексте");
            }
        }
        return count;
    }
}