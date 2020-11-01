package hw_6.task_1;

import java.util.Random;

public abstract class Animal {

    Random random = new Random();

    protected int runDistance;
    protected int swimDistance;
    protected int jumpHeight;
    final int DIVIDER = 2;

    boolean run(int distance){
        int minRunDistance = this.runDistance / DIVIDER;
        final int FINAL_RUN_HEIGHT = random.nextInt(this.runDistance - minRunDistance) + minRunDistance;
        System.out.println("Possible run distance: " + FINAL_RUN_HEIGHT);
        if (FINAL_RUN_HEIGHT >= distance) {
            return true;
        }
        return false;
    }

    boolean swim(int distance){
        int minSwimDistance = this.swimDistance / DIVIDER;
        final int FINAL_SWIM_DISTANCE = random.nextInt(this.swimDistance - minSwimDistance) + minSwimDistance;
        System.out.println("Possible swim distance: " + FINAL_SWIM_DISTANCE);
        if (FINAL_SWIM_DISTANCE >= distance) {
            return true;
        }
        return false;
    }

    boolean jump(int height){
        int minJumpHeight = this.jumpHeight / DIVIDER;
        final int FINAL_JUMP_HEIGHT = random.nextInt(this.jumpHeight - minJumpHeight) + minJumpHeight;
        System.out.println("Possible jump height: " + FINAL_JUMP_HEIGHT);
        if (FINAL_JUMP_HEIGHT > height) {
            return true;
        }
        return false;
    }
}
