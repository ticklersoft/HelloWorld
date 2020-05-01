package com.ticklersoft.hello_world;

public class Vytah implements VecRizenaVypinacem {
    private float poloha = 0;


    @Override
    public void prepnuto(boolean zapnuto) {
        if(zapnuto) {
            sjedDoDolnihoPatra();
        } else {
            vyjedDoHornihoPatra();
        }
    }

    private void sjedDoDolnihoPatra() {
        System.out.println("Sjizdim dolu");
    }

    private void vyjedDoHornihoPatra() {
        System.out.println("Jedu nahoru");
    }
}
