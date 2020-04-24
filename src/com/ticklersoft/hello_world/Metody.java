package com.ticklersoft.hello_world;

public class Metody {
    public static void main(String[] args) {
        int vysledek = Math.max(1, 2);
        vysledek = najdiMaximumZeDvouCisel(vysledek, 3);
        System.out.println(vysledek);


    }

    public static int najdiMaximumZeDvouCisel(int a1, int a2){
        if (a1 > a2){
            return a1;
        } else {
            return a2;
        }
    }

    //metoda
    //funkce
    //procedura

}
