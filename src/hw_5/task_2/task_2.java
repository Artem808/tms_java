package hw_5.task_2;

import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        // num -> numbers
        int[] num = toIntArr(args);
        int min = num[0];
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println("Максимальное число массива: " + max);
        System.out.println("Минимальное число массива: " + min);
    }

    public static int[] toIntArr(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            String elem = args[i];
            int elemNumber = Integer.valueOf(elem);
            numbers[i] = elemNumber;
        }
        return numbers;
    }
}