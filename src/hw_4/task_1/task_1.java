package hw_4.task_1;

// task_1 -> Task_1
public class task_1 {
    public static void main(String[] args) {
        // s -> wordToParse
        String s = "engineering";
                // name -> firstWord
        String name = s.substring(0, s.length()-5);
        System.out.println(name);

        // name_2 -> secondWord
        String name_2 = s.substring(7);
        System.out.println(name_2);
    }
}
