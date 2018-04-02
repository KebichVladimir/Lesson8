import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpaceParseText implements ParseText {

    @Override
    public List<String> handle(String text) {
        List<String> wordsList = new ArrayList<>(Arrays.asList(text.split(" ")));
        wordsList.remove(wordsList.size() - 1);
        return wordsList;
    }
}