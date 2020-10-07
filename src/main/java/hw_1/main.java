package hw_1;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] task1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < task1.length; i++) {
            if (task1[i] == 1){
                task1[i] = 0;
            }
            else {
                task1[i] = 1;
            }
        }
        System.out.println("Задание 1: " + Arrays.toString(task1));


        // 2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] task2 = new int[8];
        for (int i = 0, j = 0; j < task2.length; i+=3, j += 1) {
            task2[j] = i;
        }
        System.out.println("Задание 2: " + Arrays.toString(task2));


        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < task3.length; i++) {
            if (task3[i] < 6) {
                task3[i] *= 2;
            }
        }
        System.out.println("Задание 3: " + Arrays.toString(task3));


        // 4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] table = new int[5][5];
        System.out.println("Задание 4:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j){
                    table[i][j] = 1;
                }
                System.out.print(table[i][j]);
            }
            System.out.println();
        }


        // 5. ** Задать одномерный массив и
        // найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] task5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = task5.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (task5[j] > task5[j + 1]) {
                    int tmp = task5[j];
                    task5[j] = task5[j + 1];
                    task5[j + 1] = tmp;
                }
            }
        }
        System.out.println("Задание 5");
        System.out.println("Самое маленькое число: " + task5[0]);
        System.out.println("Самое большое число: " + task5[task5.length - 1]);


    }
    }