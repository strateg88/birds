package org.muratoff;


public class Main {
    int i;
    public static void main(String[] args) {
        Crow crow = new Crow();
        Sparrow sparrow = new Sparrow();
        Nightingale nightingale = new Nightingale();


        Object[] birds = new Object[3];
        birds[0] = crow;
        birds[1] = sparrow;
        birds[2] = nightingale;
        if (crow instanceof Crow){
            Crow castCrow = (Crow) birds[0];
        }
        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i]);
        }
    }
}