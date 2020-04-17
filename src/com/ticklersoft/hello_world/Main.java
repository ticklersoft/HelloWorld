package com.ticklersoft.hello_world;

public class Main {

    public static void main(String[] args) {
        //aplikace na hádání čísel od 1 do 10
        System.out.println("Hádej číslo od 1 do 10");

        //po spuštění vyzve uživatele k zadání prvního čísla
        int tipovaneCislo = 4;
        // po zadání odpoví [samá voda, přihořívá, hoří]
        int cisloKUhadnuti = (int) (Math.random()*10);
        System.out.println(cisloKUhadnuti);
        if(tipovaneCislo == cisloKUhadnuti)   {
            System.out.println("Hoří");
            return;
        }
        int tolerancePrihorivani = 2;
        if(Math.abs(tipovaneCislo - cisloKUhadnuti) <= tolerancePrihorivani)   {
            System.out.println("Prihoriva");
            return;
        }
        System.out.println("Sama voda");

        // a vyzve hráče k zadání dalšího čísla a celý proces se opakuje, dokud hráč číslo neuhodne

        // na konci vypíše počet pokusů uživatele



    }
}

