package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

/**
 * Задание: Заполнить массив на 30 элементов случайными числами
 * от -70 до +50.
 * Найти минимальный элемент и максимальный элементы и вывести их на консоль через пробел
 */
public class Task02 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - необходимо для тестирования @see ua.step.homework.TaskTest02
        long seed = 0;// args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        // TODO: Пишите код здесь
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = rnd.nextInt(51 + 70) - 70; // 0..120 - 70 = -70..+50
        }
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < 30; i++) {
            if (array[i] <= min) {
                min = array[i];
                continue;
            }
            if (array[i] >= max)
            {
                max = array[i];
            }
        }
        System.out.print(min + " " + max);
    }
}
