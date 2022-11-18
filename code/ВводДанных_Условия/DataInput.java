package ВводДанных_Условия;


import java.util.Scanner;





/**
 * Ввол данных пользователем программы
 */
public class DataInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим два целых числа
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Выводим на экран их сумму
        System.out.println("x + y = " + (x + y));

        String str = scanner.nextLine();

        System.out.println("Вы ввели следующую строку: " + str);
    }
}