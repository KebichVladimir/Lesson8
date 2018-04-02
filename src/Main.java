import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст, для выхода введите exit:");
        InputText inputText = new ConsoleInputText();
        String myText = inputText.read();
        ParseText parseText = new SpaceParseText();
        List<String> words = parseText.handle(myText);
        UniqueWorld uniqueWord = new UniqueWorld(words);
        for (String word : uniqueWord.getWordsSet())
            System.out.println(word);
        System.out.println("\nВведите слово:");
        InputText inputWord = new ConsoleInputWord();
        String myWord = inputWord.read();
        RepeatWord repeatWord = new RepeatWord(words);
        try {
            int count = repeatWord.countWorld(myWord);
            System.out.println("Слово «" + myWord + "» встречается в оригинальном тексте " + count + " раз(а)");
        } catch (NotFoundWordException e) {
            System.out.println(e.getMessage());
        }
    }
}