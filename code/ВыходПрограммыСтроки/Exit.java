package ВыходПрограммыСтроки;


import java.util.Scanner;





public class Exit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строчку: ");
        String s = sc.nextLine();

        if (s.isEmpty()) {
            System.out.println("Строка пустая!");
            System.exit(1);
        }

        System.out.println("Продолжаем...");
    }
}
