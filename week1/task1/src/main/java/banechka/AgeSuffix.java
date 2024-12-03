package banechka;

import java.util.Scanner;

public class AgeSuffix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println(age + " " + getAgeSuffix(age));
    }

    // Метод для определения правильного окончания
    public static String getAgeSuffix(int age) {
        if (age % 100 >= 11 && age % 100 <= 14) {
            return "лет";
        }
        switch (age % 10) {
            case 1:
