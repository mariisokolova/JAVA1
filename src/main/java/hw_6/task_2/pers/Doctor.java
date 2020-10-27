package hw_6.task_2.pers;

public class Doctor extends Hero {

    public Doctor(int heal, String name, int damage, int addHeal) {
        super(heal, name, damage, addHeal);
    }

    @Override
    public void hit(Hero hero) {
        System.out.println("Доктор не может бить!");
    }

    @Override
    public void healing(Hero hero) {
        hero.addHealth(addHeal);
    }
}