package ua.step.practice;

/**
 * Заполнить массив на 15 элементов числами Фибоначчи.
 * Вывести на консоль только четные элементы массива.
 * <p>
 * Пример вывода:
 * 1 2 5 13 34 89 233 610
 */
public class Task01 {
    public static void main(String[] args) {
        int[] Fibbonachi = new int[15];
        Fibbonachi[0] = 1;
        Fibbonachi[1] = 1;
        Fibbonachi[2] = 2;
        for (int i = 2; i < 15; i++) {
            Fibbonachi[i] = Fibbonachi[i-1] + Fibbonachi[i-2];
        }
        for (int i=0; i<15; i++){
            if(i%2 == 0)
            {
                System.out.print(Fibbonachi[i] + " ");
            }
        }


    }
}