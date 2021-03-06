package com.petrovsergei1974;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[3];
        fruits[0] = new Fruit();
        fruits[0].weight = 111;
        fruits[1] = new Fruit();
        fruits[1].weight = 2;
        fruits[2] = new Fruit();
        fruits[2].weight = 42;

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].weight);
        }

        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i].weight > fruits[j].weight) {
                    Fruit temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].weight);
        }
        System.out.println();

        for (Fruit fruit : fruits) {
            System.out.println(fruit.weight);
        }
    }
}
