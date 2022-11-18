package ВводДанных_Условия;


import java.util.Scanner;

// Операции сравнения
// > - строго больше
// < - строго меньше
// >= - больше либо равно
// <= - меньше либо равно
// == - равенство
// != - не равно

/**
 * Условие if, else
 */
public class ConditionIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        int x = scanner.nextInt();

        // если x = 1, выводим: Переменная X = 1
        // если x = 2, выводим: Переменная X = 2
        // иначе выводим: Привет
        if (x == 1) {
            System.out.println("Переменная X = 1");
        } else if (x == 2) {
            System.out.println("Переменная X = 2");
        } else {
            System.out.println("Привет");
        }
    }
}
