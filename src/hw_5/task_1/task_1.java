package hw_5.task_1;

import java.util.Arrays;

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
            
            if (i % 2 != 0) {
                odd = odd + i;
            }
            sum = even + odd;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма четных: " + even);
        System.out.println("Сумма нечетных: " + odd);
        System.out.println("Сумма всех: " + sum);
    }
}



