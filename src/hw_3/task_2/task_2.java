package hw_3.task_2;

public class task_2 {
    private static String msg;

    static {
        msg = "static block";
    }
    {
        msg = "regular init block";
    }

    public task_2(){
        msg = "constructor value";
    }

    public static void main (String[] args){
        task_2 task_Two = new task_2();
        System.out.println(task_Two.msg);
    }
}
