package ВводДанных_Условия;


import java.util.Scanner;

// Операции сравнения
// > - строго больше
// < - строго меньше
// >= - строго больше
// <= - строго меньше
// == - равенство
// != - не равно

/**
 * Условие if, else
 */
public class ConditionIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x == y) {
            System.out.println("Переменные X и Y равны");
        }
    }
}
