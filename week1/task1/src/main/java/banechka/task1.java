package banechka;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите ваше имя: ");
            String user = scanner.nextLine();
            System.out.println("Привет, " + user + "!");
        }
    }
}
