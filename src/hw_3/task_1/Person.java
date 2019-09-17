package hw_3.task_1;

public class Person {
    private String name;
    private int age;
    public Person() {
        this.name = "Artem";
        this.age = 27;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){

        return "name="+name+" "+"age="+age;
    }
}
