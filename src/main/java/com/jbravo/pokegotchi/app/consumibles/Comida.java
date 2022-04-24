package com.jbravo.pokegotchi.app.consumibles;

public class Comida extends Consumible {

    protected int comidasParaMorir;
    protected int saciarPeticionComida;

    public Comida(String aspecto) {
        super(aspecto);
    }

    public Comida(String aspecto,int comidasParaMorir, int saciarPeticionComida) {
        super(aspecto);
        this.comidasParaMorir = comidasParaMorir;
        this.saciarPeticionComida = saciarPeticionComida;
    }

//    public String getAspecto() {
//        return super.getAspecto();
//    }

    public int getComidasParaMorir() {
        return comidasParaMorir;
    }

    public int getSaciarPeticionComida() {
        return saciarPeticionComida;
    }
}
