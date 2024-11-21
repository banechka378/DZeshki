package week2;

import java.util.Scanner;

public class BadmintonDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите день недели (1-Понедельник, 7-Воскресенье): ");
        int dayOfWeek = scanner.nextInt();
        System.out.print("Введите температуру (жарко, тепло, холодно): ");
        String temperature = scanner.next();
        System.out.print("Введите осадки (ясно, облачно, дождь, снег, град): ");
        String precipitation = scanner.next();
        System.out.print("Есть ли ветер? (да/нет): ");
        String wind = scanner.next();
        System.out.print("Влажность (высокая/низкая): ");
        String humidity = scanner.next();

        // Проверка условий
        boolean isSunday = dayOfWeek == 7;
        boolean goodWeather = temperature.equals("тепло") && precipitation.equals("ясно") && wind.equals("нет") && humidity.equals("низкая");

        // Решение о желании играть
        if (isSunday && goodWeather) {
            System.out.println("Да, вы можете играть в бадминтон!");
        } else {
            System.out.println("Нет, лучше остаться дома.");
        }
    }
}