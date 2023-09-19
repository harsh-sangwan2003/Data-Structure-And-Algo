public class game_1 {

    public static class Person {

        int age;
        String name;

        void sayHi() {

            System.out.println(name + "[" + age + "] says hi.");
        }
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Harsh";
        p1.age = 20;

        Person p2 = new Person();
        p2.name = "Vijay";
        p2.age = 33;

        p1.sayHi();
        p2.sayHi();

        swap(p1, p2);

        p1.sayHi();
        p2.sayHi();
    }

    public static void swap(Person p1, Person p2) {

        Person temp = p1;
        p1 = p2;
        p2 = temp;
    }
}