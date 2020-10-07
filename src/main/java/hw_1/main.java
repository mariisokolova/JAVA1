package hw_1;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2400));
    }

    // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    byte b1 = 10;               // -128 127
    short s1 = 32766;           // -32768 32767
    int i1 = -3333333;          // от -2147483648 2147483647
    long l1 = 334343243232L;     // от -9223372036854775808 9223372036854775807
    float f1 = 23.34f;
    double d1 = 32.23;
    char c1 = 'd';
    boolean bl = true;
    String str = "Hello, world";


    // 3. Написать метод вычисляющий выражение a * (b + (c / d))
    // и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int count(int a, int b, int c, int d) {
        int calc = a * (b + (c / d));
        return calc;
    }


    // 4. Написать метод, принимающий на вход два числа,
    // и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;
    public static boolean checkIntBetween(int a, int b) {
        if ((a + b) > 10 && (a + b ) < 20) {
            return true;
        }
        else {
            return false;
        }
    }


    // 5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    // Замечание: ноль считаем положительным числом.
    public static String checkIntPositive(int a){
        if (a >= 0) {
            String result = "Число " + a + " положительное";
            return result;
        }
        else {
            String result = "Число " + a + " отрицательное";
            return result;
        }
    }


    // 6. Написать метод, которому в качестве параметра передается целое число,
    // метод должен вернуть true, если число отрицательное;
    public static boolean isNegativeInt(int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }


    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static String printName(String name) {
        String greeting = "Привет, " + name;
        return greeting;
    }


    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static String isLeapYear(int a) {
        if ((a % 4) == 0 &&
                ((a % 100) != 0 || (a % 400) == 0)) {

            String result = "Год " + a + " - високосный";
            return result;
        } else {
            String result = "Год " + a + " - не високосный";
            return result;
        }
    }
    }