package ru.geekbrains.qa.java2.Homework3;

/**
 * абстрактный класс фруктов. ибо нефиг создавать экземпляры неизвестного фрукта
 */
abstract class Fruit {
    private float weight;

    Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}