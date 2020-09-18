package ua.step.practice;

import java.util.Scanner;

/**
 * Задание: написать программу, которая проверяет, все ли значения
 * элементов массива различные (не повторяются). Вывести:
 * Yes – если все различные и No – если имеется хоть одно по-
 * вторение.
 * <p>
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int flag = 0;
        for (int i = 1; i < arr.length; i++){
            if (flag == 1) {
                break;
            }
                else{
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        flag = 1;
                        System.out.print("No");
                        break;
                    }
                }
            }
        }
        if (flag == 0){
            System.out.print("Yes");
        }

    }
}
