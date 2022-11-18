package ТипыДанных_Операции;


/**
 * Основные арифмитические операции
 */
public class Operations {
    public static void main(String[] args) {
        int x = 10, y = 20;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println(x * y);

        // выведет:
        // x + y = 1020
        System.out.println("x + y = " + x + y);

        // выведет:
        // x + y = 30
        System.out.println("x + y = " + (x + y));


        // > - строго больше
        // < - строго меньше
        // >= - строго больше
        // <= - строго меньше
        // == - равенство
        // != - не равно

        int k = 10;
        int d = 20;

        if (k == d) {
            System.out.println("*");
        }
    }
}
