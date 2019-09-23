package hw_5.task_4;

// task_4 -> Task_4
public class task_4 {
    public static void main(String[] args) {
        int number = 6;
        for (int n = number; n > 0; n--) {
          // путая строка не нужна
        for (int j = 1; j < n + 1; j++) {
            // for (int j = 0; j < n; j++) {
                System.out.print(".");
            }
            System.out.println("");
        }
    }
}

