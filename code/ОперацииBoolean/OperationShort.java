package ОперацииBoolean;





import java.util.Scanner;





/**
 * Короткая форма записи операций
 */
public class OperationShort {
    public static void main(String[] args) {
        int x = 10;
        x += 10; // x = x + 10;
        x -= 10; // x = x - 10;
        x *= 10; // x = x * 10;
        x /= 10; // x = x / 10;
        x %= 10; // x = x % 10;

        // ----------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите y = ");
        int y = sc.nextInt();
        System.out.print("Введите z = ");
        int z = sc.nextInt();

        int sum = y++ + z++;
        System.out.println("sum = " + sum);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
