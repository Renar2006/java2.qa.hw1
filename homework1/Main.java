package ru.geekbrains.qa.java2.homework1;

import ru.geekbrains.qa.java2.homework1.animals.*;
import ru.geekbrains.qa.java2.homework1.barrier.*;

public class Main {

    public static void main(String[] args) {
        Course course = new Course();
        Team team = new Team("Добрые питомцы");
        team.printInformationAboutTheTeam();
        course.printInformationAboutTheObstacle();
        course.passObstacles(team);
        team.passedTheDistance();

    }
}
