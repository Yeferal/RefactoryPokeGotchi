package com.jbravo.pokegotchi.app.consumibles;

public abstract class Consumible {

    private String aspecto;

    public Consumible(String aspecto){
        this.aspecto = aspecto;
    }

    public String getAspecto(){ return aspecto;}
}
