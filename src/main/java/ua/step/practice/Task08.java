package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;


/**
 * Задание: Заполнить массив размерности n случайными строчны-
 * ми (маленькими) латинскими буквами. Подсчитать, сколько раз встреча-
 * ется каждая буква. Вывести буквы, которые встречаются
 * больше 3 раз. n – задается с клавиатуры.
 * <p>
 * Пример вывода:
 * g - 4 раза
 * l - 4 раза
 * s - 5 раз
 * v - 5 раз
 * x - 5 раз
 */
public class Task08 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest08
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        char[] arr; // Зачем создавать int массив, если можно сделать это через char?
        arr = new char[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (rnd.nextInt('z' - 'a' + 1) + 'a');
        }
        int[] meet = new int['z' - 'a' + 1];

        for (char c : arr) { // Прогоняем каждый элемент массива ( как в Python in )
            int idx = c - 'a';
            meet[idx]++;
        }

        for (int i = 0; i < meet.length; i++) {
            if (meet[i] > 3) {
                System.out.printf("%c - %d %s\n", i + 'a', meet[i], meet[i] < 5 ? "раза" : "раз");
            }
        }
    }
}
