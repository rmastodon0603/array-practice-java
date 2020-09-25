package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Есть массив размером n элементов и заполненный
 * случайными числами в диапазоне от 0 до 100.
 * Необходимо разделить этот массив на массивы меньшего
 * размера в каждом из которых будет находиться не менее m элементов из
 * большого массива.
 * Значения n и m вводятся с клавиатуры пользователем.
 * Вывести на экран исходный массив и разделенный массив.
 *
 * Пример вывода:
 *
 * Исходный массив [35, 80, 39, 79, 63, 32, 89, 22, 29, 29]
 * Результат
 * [35, 80, 39]
 * [79, 63, 32]
 * [89, 22, 29]
 * [29]
 */
public class Task11 {

    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest09
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массивов через пробел: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr;
        arr = new int[n];
        System.out.print("Исходный массив [");
        for(int i=0; i< arr.length; i++)
        {
            arr[i] = rnd.nextInt(101);
            System.out.print(arr[i]);
            if(i!= arr.length-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Дальше идём выводить результат, но?, с тестом что - то не так?
        System.out.print("Результат\n"+ "[");
        int[] mas = new int[m];
        int k =0;
        for(int i=0; i< arr.length; i++)
        {
            mas[k] = arr[i];
            System.out.print(mas[k]);
            k++;
            if((i+1)%m == 0)
            {
                System.out.println("]");
                if(i!= arr.length-1)
                {
                    System.out.print("[");
                }
                k = 0;
            }
            else if ((i+1) % m != 0 && i != arr.length - 1)
            {
                System.out.print(", ");
            }
            else
            {
                System.out.print("]");
            }
        }
    }
}
