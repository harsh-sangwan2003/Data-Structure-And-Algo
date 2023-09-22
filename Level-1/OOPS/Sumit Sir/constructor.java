public class constructor {

    public static class Person {

        int age;
        String name;

        void sayHi() {

            System.out.println(name + "[" + age + "] says hi.");
        }

        Person() {

        }

        Person(String name, int age) {

            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Harsh";
        p1.age = 20;
        p1.sayHi();

        Person p2 = new Person("Vijay", 33);
        p2.sayHi();
    }
}