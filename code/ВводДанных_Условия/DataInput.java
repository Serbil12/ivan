package ВводДанных_Условия;


import java.util.Scanner;





/**
 * Ввол данных пользователем программы
 */
public class DataInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим два целых числа
        System.out.print("Введите x: ");
        int x = scanner.nextInt();
        System.out.print("Введите y: ");
        int y = scanner.nextInt();

        // Выводим на экран их сумму
        System.out.println("x + y = " + (x + y));
    }
}


























