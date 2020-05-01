package com.ticklersoft.hello_world;

public class Vypinac implements IVypinac {
    private boolean zapnuto;
    private VecRizenaVypinacem delegat;

    public Vypinac(VecRizenaVypinacem delegat) {
        this.delegat = delegat;
    }

    public VecRizenaVypinacem getDelegat() {
        return delegat;
    }

    public void zapni(){
        if (!zapnuto) {
            zapnuto = true;
            informujDelegata(true);
        }
    }

    public void vypni(){
        if (zapnuto) {
            zapnuto = false;
            informujDelegata(false);
        }
    }

    private void informujDelegata(boolean stav){
//        if (delegat != null){
            delegat.prepnuto(stav);
//        }
    }
}
