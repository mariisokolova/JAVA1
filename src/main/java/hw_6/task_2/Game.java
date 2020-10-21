package hw_6.task_2;

import hw_6.task_2.pers.Assasin;
import hw_6.task_2.pers.Doctor;
import hw_6.task_2.pers.Hero;
import hw_6.task_2.pers.Warrior;

import java.util.Random;

class Game {
    public static void main(String[] args) {

        Random randomStep = new Random();
        Random randomHealing = new Random();
        Random randomHitTarget = new Random();

        Hero[] team1 = new Hero[]{new Warrior(250, "Тигрил", 50, 0)
                , new Assasin(150, "Акали", 70, 0)
                , new Doctor(120, "Жанна", 0, 60)};

        Hero[] team2 = new Hero[]{new Warrior(290, "Минотавр", 60, 0)
                , new Assasin(160, "Джинкс", 90, 0)
                , new Doctor(110, "Зои", 0, 40)};

        while (teamAlive(team1) && teamAlive(team2)){
            for (int i = 0; i < team1.length; i++) {
                if (randomStep.nextInt(2) == 0) {
                    if (team1[i] instanceof Doctor) {
                        team1[i].healing(team1[randomHealing.nextInt(2)]);
                    } else {
                        // В изначальной версии было team1[i].hit(team2[i]), что приводило к вечному циклу.
                        // Один персонаж победил другого, а далее совершает удары по уже побежденному противнику.
                        // Поэтому сюда была введена рандомизация для выбора цели удара.
                        team1[i].hit(team2[randomHitTarget.nextInt(team2.length)]);
                    }
                } else {
                    if (team2[i] instanceof Doctor) {
                        team2[i].healing(team2[randomHealing.nextInt(2)]);
                    } else {
                        team2[i].hit(team1[randomHitTarget.nextInt(team1.length)]);
                    }
                }
            }
        }

        System.out.println("---------------");

        for (Hero t1 : team1) {
            t1.info();
        }

        for (Hero t2 : team2) {
            t2.info();
        }
    }

    private static boolean teamAlive(Hero[] team) {
        int aliveHeroes = 0;
        for (int i = 0; i < team.length; i++) {
            team[i].info();
            if (team[i].getHealth() > 0){
                aliveHeroes += 1;
            }
        }
        if (aliveHeroes > 0){
            return true;
        }
        else {
            return false;
        }
    }
}