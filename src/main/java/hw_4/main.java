package hw_4;

import java.util.Random;
import java.util.Scanner;

public class main {

    static final int SIZE_X = 3;
    static final int SIZE_Y = 3;

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static final char PLAYER_DOT = 'X';
    static final char AI_DOT = 'O';
    static final char EMPTY_DOT = '.';

    static Scanner scanner = new Scanner(System.in);
    static final Random rand = new Random();

    private static void initField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void printField() {
        System.out.println("-------");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    private static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    private static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X Y (1-3)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y,x));
        setSym(y, x, PLAYER_DOT);
    }

    private static void aiStep() {
        int x;
        int y;
        do {
            x = rand.nextInt(SIZE_X);
            y = rand.nextInt(SIZE_Y);
        } while (!isCellValid(y,x));
        setSym(y, x, AI_DOT);
    }

    private static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }

    private static boolean isFieldFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }

    //  Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
    private static boolean checkWin(char sym) {
        for (int i = 0; i < SIZE_X; i++) {
            int counter_x = 0;
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == sym) {
                    counter_x += 1;
                }
            }
            if (counter_x == SIZE_X) {
                return true;
            }
        }
        for (int i = 0; i < SIZE_Y; i++) {
            int counter_y = 0;
            for (int j = 0; j < SIZE_Y; j++) {
                if (field[j][i] == sym) {
                    counter_y += 1;
                }
            }
            if (counter_y == SIZE_Y) {
                return true;
            }
        }
        int counter_xy = 0;
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                if (i == j && field[i][j] == sym) {
                    counter_xy += 1;
                }
            }
            }
        if (counter_xy == SIZE_Y) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerStep();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("PLAYER WIN!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("DRAW");
                break;
            }
            aiStep();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("SKYNET WIN!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("DRAW");
                break;
            }
        }

    }
}
