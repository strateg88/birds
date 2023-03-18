package org.muratoff;


public class Main {
    public static void main(String[] args) {
        Crow crow = new Crow();
        Sparrow sparrow = new Sparrow();
        Nightingale nightingale = new Nightingale();

        String[] birds = new String[3];
        birds[0] = crow.song("Кар");
        birds[1] = sparrow.song("Хз");
        birds[2] = nightingale.song("тоже хз");

        for (int i = 0; i < 2; i++) {
            System.out.println(birds[i]);
        }
    }
}