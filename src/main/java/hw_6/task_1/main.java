package hw_6.task_1;

public class main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println("Cat run: " + cat1.run(17500));
        System.out.println("Cat jump: " + cat1.jump(150));
        System.out.println("Cat swim: " + cat1.swim(10));

        System.out.println("\n--------------\n");

        Cat cat2 = new Cat();
        System.out.println("Cat run: " + cat2.run(17500));
        System.out.println("Cat jump: " + cat2.jump(150));
        System.out.println("Cat swim: " + cat2.swim(10));

        System.out.println("\n--------------\n");

        Dog dog1 = new Dog();
        System.out.println("Dog run: " + dog1.run(75000));
        System.out.println("Dog jump: " + dog1.jump(75));
        System.out.println("Dog swim: " + dog1.swim(7500));

        System.out.println("\n--------------\n");

        Dog dog2 = new Dog();
        System.out.println("Dog run: " + dog2.run(100));
        System.out.println("Dog jump: " + dog2.jump(100));
        System.out.println("Dog swim: " + dog2.swim(10000));
    }
}