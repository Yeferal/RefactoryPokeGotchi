package com.jbravo.pokegotchi.app.consumibles;

public class Medicina extends Consumible{

    private int curarEnfermedades;

    public Medicina(String aspecto) {
        super(aspecto);
    }

    public Medicina(String aspecto,int curarEnfermedades) {
        super(aspecto);
        this.curarEnfermedades = curarEnfermedades;
    }

    public int getCurarEnfermedades() {
        return curarEnfermedades;
    }
}
