package ВыходПрограммыСтроки;


import java.util.Scanner;





public class Exit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строчку: ");
        String s = sc.nextLine();

        System.out.println("Исходная строка: " + s);
        System.out.println("Верхний регистр: " + s.toUpperCase());
        System.out.println("Нижний регистр: " + s.toLowerCase());
    }
}
