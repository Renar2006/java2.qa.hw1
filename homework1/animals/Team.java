package ru.geekbrains.qa.java2.homework1.animals;

import java.util.*;


/**
 * 2. Добавить класс Team, который будет содержать: название команды, массив из 4-х участников
 * (т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации о
 * членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
 */

public class Team {

    private String nameTeam = "Добрые питомцы";
    Animal[] pet = {new Cat("Том"), new Rooster("Пётр"), new Dog("Рекс"), new Cow("Марта")};
    public Animal[] teamAnimal = new Animal[4];
    Random random = new Random();

    // Формируем команду
    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        for(int i = 0; i < 4; i++){
            int ran = random.nextInt(4);
            teamAnimal[i] = pet[ran];
        }
    }

    // Вывод информации о членах команды
    public void printInformationAboutTheTeam() {
        System.out.println("Команда: " + nameTeam);
        for(Animal a : teamAnimal) {
            System.out.println(a);
            System.out.println("Бег: " + a.run_limit);
            if (a instanceof Swimable)
                System.out.println("Плавание: " + ((Swimable) a).getSwimLimit());
            if (a instanceof Jumpable)
                System.out.println("Прыжок: " + ((Jumpable) a).getJumpLimit());
        }
        System.out.println();
    }

    // Вывод информации кто прошел дистанцию
    public void passedTheDistance(){
        System.out.println(nameTeam + "\n");
        for (Animal a : teamAnimal){
            if(a.passing){
                System.out.println(a + " дистанция успешно пройдена.\n");
            } else {
                System.out.println(a + " дистанция не пройдена.\n");
            }
        }
        System.out.println();
    }
}
