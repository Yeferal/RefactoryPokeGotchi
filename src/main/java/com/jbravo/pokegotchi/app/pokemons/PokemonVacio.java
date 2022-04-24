package com.jbravo.pokegotchi.app.pokemons;

import javax.swing.*;

public class PokemonVacio extends Pokemon{

    public PokemonVacio(){
        super("Espacio vacío :3", "Puedes adoptar en Tienda", "/icons/Vacio.png", "", 0, 0);
    }

    public void alimentar(String comida) {
        JOptionPane.showMessageDialog(null, "¡Espacio vacío! Puedes adoptar en tienda");
    }

    public void curar(String medicina) {
        super.alerta("¡Espacio vacío! Puedes adoptar en tienda");
    }
}
