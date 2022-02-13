package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal[] animal = {new Shark(), new Turtle(), new Eagle()};
        for (Animal a : animal) {
            a.aVoid();
        }
    }
}
