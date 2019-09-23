package hw_5.task_1;

import java.util.Arrays;
// task_1 -> Task_1
public class task_1 {
    public static void main(String[] args) {
        int[] arr = new int[101];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int even = 0;
        int odd = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even = even + i;
            }
            // пустая строка не нужна
            if (i % 2 != 0) {
                odd = odd + i;
            }
            // зачем каждый раз в цикле считать сумму? это можно сделать 1 раз за его пределами
            sum = even + odd;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма четных: " + even);
        System.out.println("Сумма нечетных: " + odd);
        System.out.println("Сумма всех: " + sum);
    }
}



