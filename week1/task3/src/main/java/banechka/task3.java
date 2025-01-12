package banechka;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите длину ребра додекаэдра: ");
            double edgeLength = scanner.nextDouble();

            double volume = (15 + 7 * Math.sqrt(5)) / 4 * Math.pow(edgeLength, 3);
            System.out.printf("Объем додекаэдра: %.3f\n", volume);
        }
    }
}