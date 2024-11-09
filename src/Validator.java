import java.util.Scanner;

public class Validator {
    private Scanner sc;

    public Validator(Scanner scanner) {
        this.sc = scanner;
    }

    public double getPositiveDouble(String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            while (!sc.hasNextDouble()) {
                System.out.print("Ошибка: Введите корректное число: ");
                sc.next();
            }
            value = sc.nextDouble();
            if (value > 0) {
                break;
            } else {
                System.out.println("Ошибка: число должно быть положительным.");
            }
        }
        return value;
    }

    public int getValidChoice(int min, int max) {
        int choice;
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.print("Ошибка: Введите число: ");
                sc.next();
                continue;
            }
            choice = sc.nextInt();
            if (choice >= min && choice <= max) {
                break;
            } else {
                System.out.println("Ошибка: выберите вариант от " + min + " до " + max);
            }
        }
        return choice;
    }
}
