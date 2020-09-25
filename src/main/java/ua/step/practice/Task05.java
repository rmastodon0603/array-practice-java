package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

/**
 * Задание: Заполнить массив на 10 элементов случайными числами
 * от -5 до +5. Посчитать количество повторяющихся значений.
 * Вывести на консоль только повторяющиеся элементы (больше одного повторения)
 * и количество повторений.
 * <p>
 * Пример:
 * 0 – 5 раз
 * 2 – 3 раза
 * 7 – 2 раза
 */
public class Task05 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest05
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        // TODO: Пишите код здесь
        int[] mas = new int[10];

        for(int i=0; i< mas.length; i++)
        {
            mas[i] = rnd.nextInt(6+5) - 5;
        }

        for(int i = 0; i< mas.length - 1; i++)
        {
            int counter = 1;
            for(int j = 0; j< mas.length; j++)
            {
                if(j!=i)
                {
                    if(mas[i] == mas[j])
                    {
                        if(j<i)
                        {
                            break;
                        }
                        else
                        {
                            counter++;
                        }
                    }
                }
            }
            if(counter > 1)
            {
                System.out.println(mas[i] + " - " + counter + " раза");
            }
        }
    }
}
