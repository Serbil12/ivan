package ОперацииBoolean;


import java.util.Scanner;





public class TernarnayaOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = sc.nextInt();

        System.out.println("Вы ввели x = " + x);

        //  Напишем условие с помощью тернарной операции
        System.out.println(x >= 0 ? "X больше либо равно 0" : "X меньше 0");

        int y = x == 10 ? 10 : 5;
        System.out.println("y = " + y);

        /*if (x >= 0) {
            System.out.println("X больше либо равно 0");
        } else {
            System.out.println("X меньше 0");
        }*/
    }
}
