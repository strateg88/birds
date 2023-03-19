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
        if (birds[0] instanceof Crow) {
            Crow castCrow = (Crow) birds[0];
        }


        for (int i = 0; i < birds.length; i++) {
            if (birds[i] instanceof Crow) {
                Crow castCrow = (Crow) birds[i];
                castCrow.song();
            }
            if (birds[i] instanceof Sparrow) {
                Sparrow castSparrow = (Sparrow) birds[i];
                castSparrow.song();
            }
            if (birds[i] instanceof Nightingale) {
                Nightingale castNightingale = (Nightingale) birds[i];
                castNightingale.song();

            }
        }
    }
}