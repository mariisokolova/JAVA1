package hw_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    int getFood() {
        return food;
    }

    void addFood(int addFood) {
        food += addFood;
    }
}
