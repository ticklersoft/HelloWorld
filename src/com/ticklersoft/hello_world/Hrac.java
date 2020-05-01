package com.ticklersoft.hello_world;

public class Hrac {
    public String jmeno;
    public int skore = 0;
    public int hitpoints = 100;

    public void takeDamage(int damage){
        hitpoints -= damage;
    }

    public boolean isAlive(){
        return hitpoints > 0;
    }

    public void zvysSkore(){
        skore++;
    }

}
