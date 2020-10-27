package hw_7;

public class Cat {
    private String name;
    private int appetite;

    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            isFull = true;
        } else {
            System.out.println(name + " нужно больше еди");
            isFull = false;
        }
    }

    boolean getIsFull() {
        return isFull;
    }

    String getName() {
        return name;
    }
}
