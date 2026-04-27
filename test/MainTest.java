import java.util.Scanner;
// Жолдас Қайсар ИС 24-22

public class Labwork15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String upper = input.toUpperCase();

        System.out.println("Результат: " + upper);
        scanner.close();
    }
}
