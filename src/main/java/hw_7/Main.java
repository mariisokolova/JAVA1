package hw_7;

public class Main {
    public static void main(String[] args) {
        String yes = "yes";
        String no = "no";

        Cat[] cat = {new Cat("Cat1", 5), new Cat("Cat2", 6), new Cat("Cat3", 9)};
        Plate plate = new Plate(100);

        plate.info();

        for (Cat c: cat){
            c.eat(plate);

            System.out.println(c.getName() + " is full? " + (c.getIsFull() == true ? yes : no));

            plate.info();
            plate.addFood(30);
            plate.info();
        }
    }
}