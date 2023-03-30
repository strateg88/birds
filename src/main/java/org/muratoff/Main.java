package org.muratoff;


public class Main {
    int i;

    public static void main(String[] args) {
        Crow crow = new Crow();
        Sparrow sparrow = new Sparrow();
        Nightingale nightingale = new Nightingale();


        Bird[] birds = new Bird[3];
        birds[0] = crow;
        birds[1] = sparrow;
        birds[2] = nightingale;


        for (int i = 0; i < birds.length; i++) {
            birds[i].song();

        }
    }
}