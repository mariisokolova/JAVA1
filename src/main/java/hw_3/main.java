package hw_3;

import java.util.Random;
import java.util.Scanner;

public class main {

    // Написать программу, которая загадывает случайное число от 0 до 9,
    // и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить
    // больше ли указанное пользователем число чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос –
    // «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        randomNumberGame();

        String spaceString = "Предложение   один      Теперь второе   предложение     Последнее предложение";
        System.out.println(stringCleaner(spaceString));
    }

    public static void randomNumberGame(){
        Random rand = new Random();
        int play = 1;
        do {
            int x = rand.nextInt(9);
            for (int i = 1; i < 4; i++) {
                int d = getNumberFromScanner("Введите число в пределах от 0 до 9", 0, 9);
                if (d == x) {
                    System.out.println("Победа!");
                    break;
                }
                else {
                    String hint = (x > d) ? "Загаданное число больше." : "Загаданное число меньше.";
                    System.out.println(String.format("Вы не угадали число c %d попытки. %s", i, hint));
                }
            }
            System.out.println(String.format("Игра окончена. Было загадано: %d. " +
                    "Хотите сыграть еще раз? Да - 1, Нет - 0.", x));
            play = getNumberFromScanner("", 0, 1);
        } while (play == 1);
        System.out.println("Спасибо за игру. До новых встреч!");
    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }



    // Доработка задания с урока
    public static StringBuilder stringCleaner(String string){
        string = string.replaceAll(" +", " ");

        if (string.charAt(string.length() - 1) != '.') {
            string = string + ".";
        }

        StringBuilder cleanString = new StringBuilder(string);

        for (int i = 1; i < cleanString.length(); i++) {
            if (cleanString.charAt(i) >= 'A' && cleanString.charAt(i) <= 'Я'){
                cleanString.setCharAt(i - 1, '.');
            }
        }
        for (int i = 1; i < cleanString.length(); i++) {
            if (cleanString.charAt(i) == '.') {
                cleanString = cleanString.replace(i, i + 1, ". ");
            }
        }

        return cleanString;
    }
}
