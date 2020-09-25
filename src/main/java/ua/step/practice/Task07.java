package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Задание: Заполнить массив размерности n случайными цифрами
 * от 3 до 13. Подсчитать, сколько раз встречается каждая циф-
 * ра. Вывести результат на экран. n – задается с клавиатуры
 *
 * Пример вывода:
 *      3 - 2 раза
 *      5 - 3 раза
 *      8 - 1 раза
 *      9 - 3 раза
 *      11 - 1 раза
 */
public class Task07 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest07
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(14 - 3) + 3;
        }
        Arrays.sort(arr); // тест не работает может из - за этого? - сортируем массив как в пайтоне

        for (int i = 0; i < arr.length; i++) {
            int stop = 0;
            int flag = 1;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    if (arr[i] == arr[j]) {
                        if (j < i) {
                            stop++;
                            break;
                        } else {
                            flag++;
                        }
                    }
                }
            }

            if (stop == 0) {
                System.out.println(arr[i] + " - " + flag + " раза");
            }
        }
    }
}
