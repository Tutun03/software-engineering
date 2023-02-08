
class Person {
    String name;
    int age;
Person(){

}
    Person(String n, int a) {
        name = n;
        age = a;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2=new Person();
        person2.age=32;
        System.out.println(person1.name);

        System.out.println(person1.age);
    }
}