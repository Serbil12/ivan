package ОперацииBoolean;


public class Boolean {
    public static void main(String[] args) {
        int x = 0;
        boolean s = x != 0; // s = false

        if (s) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

        // ----------------------------------

        String t = "Java";
        boolean r = t == "Java"; // r = true


        if (r) {
            System.out.println("Это язык Java!");
        } else {
            System.out.println("Нет");
        }
    }
}
