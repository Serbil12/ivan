package ЛогическиеОперации;


import java.util.Scanner;





public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int x = 1;
        System.out.print("Введите y = ");
        int y = sc.nextInt();

        if (y == 0) {
            System.out.println("На 0 делить нельзя!");
            System.exit(1);
        }

        System.out.println("x / y = " + x / y);
    }
}
