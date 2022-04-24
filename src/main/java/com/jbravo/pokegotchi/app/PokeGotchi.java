package com.jbravo.pokegotchi.app;

import com.jbravo.pokegotchi.app.consumibles.*;
import com.jbravo.pokegotchi.app.motor.Jugador;
import com.jbravo.pokegotchi.ui.PrincipalFrame;

public class PokeGotchi {

    public static Jugador jugador = new Jugador();
    // Comidas y medicinas a las que se accede
    public static final Comida manzana = new Comida("/consumibles/Manzana.png", 5, 1);
    public static final Comida cereal = new Comida("/consumibles/Cereal.png", 7, 1);
    public static final Comida waffles = new Comida("/consumibles/Waffles.png", 10, 1);


    public static final Medicina vitaminas = new Medicina("/consumibles/Vitamina.png", 1);
    public static final Medicina analgesico = new Medicina("/consumibles/Analgesico.png", 2);
    public static final Medicina antibiotico = new Medicina("/consumibles/Antibiotico.png", 3);
    public static PrincipalFrame ventanaPrincipal = new PrincipalFrame();
    public static int tiempoDeVida = 15; //rango para el tiempo de vida random

    public static void main(String [] args){

        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);
    }
}
