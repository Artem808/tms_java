package hw_5.task_4;

public class task_4 {
    public static void main(String[] args) {
        int number = 6;
        for (int n = number; n > 0; n--) {
            // for (int j = 1; j < n + 1; j++)  - зачем j=1 и при этом n+1?
            // for (int j = 0; j < n; j++) - думаю так получше
            for (int j = 1; j < n + 1; j++) {
                System.out.print(".");
            }
            System.out.println("");
        }
    }
}

