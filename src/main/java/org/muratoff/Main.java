package org.muratoff;


public class Main {
    public static void main(String[] args) {
        Object obj1 = new Crow();
        Object obj2 = new Sparrow();
        Object obj3 = new Nightingale();
        System.out.println(obj1 instanceof Crow);
        System.out.println(obj1 instanceof Sparrow);
        System.out.println(obj1 instanceof Nightingale);
        System.out.println(obj2 instanceof Crow);
        System.out.println(obj2 instanceof Sparrow);
        System.out.println(obj2 instanceof Nightingale);
        System.out.println(obj3 instanceof Crow);
        System.out.println(obj3 instanceof Sparrow);
        System.out.println(obj3 instanceof Nightingale);
        Crow crow = (Crow) obj1;
        Sparrow sparrow = (Sparrow) obj2;
        Nightingale nightingale = (Nightingale) obj3;

        Object[] birds = new Object[3];
        birds[0] = crow;
        birds[1] = sparrow;
        birds[2] = nightingale;

        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i]);
        }
    }
}