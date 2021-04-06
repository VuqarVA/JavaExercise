package test.VuqarAmirov;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Vuqar");
        System.out.println(student1.toName());
        student1.setAge(10);
        System.out.println(student1.getAge());
        System.out.println("Hello");
    }
}
