package hw_6.task_1;

public class Cat extends Animal{

    public Cat(){
        super.jumpHeight = 200;
        super.runDistance = 20000;
    }

    @Override
    boolean swim(int distance){
        return false;
    }


}
