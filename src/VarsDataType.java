// переменные, типы данных
public class VarsDataType {
    public static void main(String[] args) {
        // После объявления переменной под нее выделяется определенная память,
        // размер которой зависит от используемого типа данных.

        int x = 10; // целое число от –2 147 483 648 до 2 147 483 647, занимает 4 байта
        double y = 10.5; // вещественное число двойное точности, занимает 8 байт
        float y1 = 10.5f; // вещественное число, занимает 4 байта
        char ch = 'b'; // один символ
        boolean isInt = true; // логический тип данных, принимает значение true/false
        long g = 1000L; // целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807, занимает 8 байт

        String name = "Ivan"; // строковый тип, каждый символ в строке = 1 байт

        // -----------------------------

        int d; // объявление переменной, 4 байт
        d = 10; // операция присвоения

        int i = 200; // инициализация (это объявление и присвоение в одну строчку)


        // -----------------------------

        int r, k, t; // объявление нескольких переменных

        double r1 = 10.5, r2 = 2.5, r3; // инициализация двух переменных r1 и r2, и объявление переменной r3


        // t1 и T2 - это разные переменные, так как язык case sensitive - то есть регистрозависимый (верхний или нижний регистр)
        int t1 = 10;
        int T1 = 10;

        // ----------------------------
        // в переменных могут быть числа (но число не может стоять на первом месте), нижнее подчеркивание, знак $ и любые буквы
        // но переменная не
        int _1x;

        // ошибка, так как переменная не может начинаться с числа

        int X_Y1_$dk;

        double op_10203040df;
    }
}