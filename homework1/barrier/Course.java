package ru.geekbrains.qa.java2.homework1.barrier;

import java.util.*;
import ru.geekbrains.qa.java2.homework1.animals.*;

/**
 * 3. Добавить класс Course (полоса препятствий), в котором будут находиться:
 * массив препятствий, метод который будет просить команду пройти всю полосу;
 */

public class Course {

    Let[] let = new Let[3];
    Random random = new Random();
    // Создаем полосу препятствий
    public Course() {
        Way way = new Way(random.nextInt(100));
        Wall wall = new Wall(random.nextFloat() * 4);
        Water water = new Water(random.nextInt(50));
        let[0] = (Let) way;
        let[1] = (Let) wall;
        let[2] = (Let) water;
    }
    //Вывод информации о полосе препятствий
    public void printInformationAboutTheObstacle() {
        System.out.println("Длина дорожки: " + ((Way) let[0]).getLength());
        System.out.println("Высота стены: " + ((Wall) let[1]).getHeight());
        System.out.println("Длина водной дорожки: " + ((Water) let[2]).getLength());
        System.out.println();
    }
    // Проходим полосу препятствий
    public void passObstacles(Team team){
        for(Animal animal : team.teamAnimal){
            for(Let l : let){
                if(!l.doIt(animal)){
                    animal.setPassing(l.doIt(animal));
                    break;
                }
                animal.setPassing(true);
            }
        }
    }
}