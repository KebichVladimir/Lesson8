import java.util.Scanner;

public class ConsoleInputText implements InputText {

    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine());
            stringBuilder.append(" ");
            if (stringBuilder.indexOf("exit") > 0) break;
        }
        return stringBuilder.toString();
    }
}