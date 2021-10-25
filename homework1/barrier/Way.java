package ru.geekbrains.qa.java2.homework1.barrier;

import ru.geekbrains.qa.java2.homework1.animals.*;

public class Way implements Let {
    private int length;

    public Way(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(Animal animal) {
        return animal.run(length);
    }
    public int getLength(){
        return length;
    }
}