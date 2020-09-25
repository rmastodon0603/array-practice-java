package ua.step.practice;

import java.util.Scanner;

/**
 * Программа должна выводить слово Yes для симметрич-
 * ного массива и слово No – для несимметричного. Симме-
 * тричным считается массив, в котором значения элементов с
 * конца равно значению элементов с начала. Массив заполняется
 * пользователем вручную.
 * Размер массива (количество строк и колонок) задается при
 * запуске программы.
 *
 * Примеры значений для симметричного массива:
 * <p>
 * 1, 2, 3, 2, 1
 * 2, 2, 3, 2, 2
 * 1, 3, 2, 3, 1
 * 5, 4, 3, 4, 5
 *
 *
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размернось массива (сколько строк и колонок): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // TODO: Пишите код здесь
        int[][] marr;
        marr = new int[rows][cols];
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                marr[i][j] = scanner.nextInt();
            }
        }
        int flag = 0;
        for(int i=0; i<rows; i++)
        {
            int cols_tmp = cols-1;
            for(int j=0; j<=cols/2; j++)
            {
                if(marr[i][j] != marr[i][cols_tmp])
                {
                    flag++;
                    break;
                }
                cols_tmp--;
            }

            if(flag>0)
            {
                break;
            }
        }
        if(flag > 0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}
