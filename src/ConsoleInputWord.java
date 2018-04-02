import java.util.Scanner;

public class ConsoleInputWord implements InputText {

    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        return word;
    }
}