package com.jbravo.pokegotchi.app.pokemons;

import com.jbravo.pokegotchi.app.PokeGotchi;
import com.jbravo.pokegotchi.app.consumibles.Comida;
import com.jbravo.pokegotchi.app.consumibles.Medicina;
import com.jbravo.pokegotchi.app.motor.Jugador;
import com.jbravo.pokegotchi.app.motor.VidaPokemon;
import com.jbravo.pokegotchi.ui.PrincipalFrame;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Pokemon {

    Random random = new Random();

    private String nombrePokemon;//*
    private String apodo;//*
    private String aspecto;//*
    private String fechaDeNacimiento;//*

    private int nivel;//*
    private int contadorBatallas = 0;                     //cantidad de batallas realizadas
    private int batallasParaSubirDeNivel = 1;//*          //cantidad de batallas que hay que alcanzar para subir de nivel

    private int contadorComida = 0;                       //cuenta las veces que come, si llega a 2 hace popo, popo +1
    private int contPeticionComida = 0;                   //cuenta las peticiones de comida,
    private int cantidadComidasParaMorir = 5;             //por defecto 5 peticiones son necesarias para morir;
    private int contPopo = 0;
    private int contPeticionPaseo = 0;

    private int posicionMascota;                          //indica la posicion del array donde se encuentra.

    private int contadorEnfermedades = 0;                 //Si alcanza 6 muere
    private int vida;
    private int tiempoRandom = PokeGotchi.tiempoDeVida;   //random inicial del tiempo

    public Pokemon(){}

    public Pokemon(String nombrePokemon, String apodo, String aspecto, String fechaDeNacimiento) {
        this.nombrePokemon = nombrePokemon;
        this.apodo = apodo;
        this.aspecto = aspecto;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Pokemon(String nombrePokemon, String apodo, String aspecto, String fechaDeNacimiento, int nivel) {
        this.nombrePokemon = nombrePokemon;
        this.apodo = apodo;
        this.aspecto = aspecto;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nivel = nivel;
    }

    public Pokemon(String nombrePokemon, String apodo, String aspecto, String fechaDeNacimiento, int nivel, int batallasParaSubirDeNivel) {
        this.nombrePokemon = nombrePokemon;
        this.apodo = apodo;
        this.aspecto = aspecto;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nivel = nivel;
        this.batallasParaSubirDeNivel = batallasParaSubirDeNivel;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getAspecto() {
        return aspecto;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getContadorBatallas() {
        return contadorBatallas;
    }

    public void setContadorBatallas(int contadorBatallas) {
        this.contadorBatallas = contadorBatallas;
    }

    public int getBatallasParaSubirDeNivel() {
        return batallasParaSubirDeNivel;
    }

    public void setBatallasParaSubirDeNivel(int batallasParaSubirDeNivel) {
        this.batallasParaSubirDeNivel = batallasParaSubirDeNivel;
    }

    public int getContadorComida() {
        return contadorComida;
    }

    public void setContadorComida(int contadorComida) {
        this.contadorComida = contadorComida;
    }

    public int getContPeticionComida() {
        return contPeticionComida;
    }

    public void setContPeticionComida(int contPeticionComida) {
        this.contPeticionComida = contPeticionComida;
    }

    public int getCantidadComidasParaMorir() {
        return cantidadComidasParaMorir;
    }

    public void setCantidadComidasParaMorir(int cantidadComidasParaMorir) {
        this.cantidadComidasParaMorir = cantidadComidasParaMorir;
    }

    public int getContPopo() {
        return contPopo;
    }

    public void setContPopo(int contPopo) {
        this.contPopo = contPopo;
    }

    public int getContPeticionPaseo() {
        return contPeticionPaseo;
    }

    public void setContPeticionPaseo(int contPeticionPaseo) {
        this.contPeticionPaseo = contPeticionPaseo;
    }

    public int getPosicionMascota() {
        return posicionMascota;
    }

    public void setPosicionMascota(int posicionMascota) {
        this.posicionMascota = posicionMascota;
    }

    public int getContadorEnfermedades() {
        return contadorEnfermedades;
    }

    public void setContadorEnfermedades(int contadorEnfermedades) {
        this.contadorEnfermedades = contadorEnfermedades;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getTiempoRandom() {
        return tiempoRandom;
    }

    public void setTiempoRandom(int tiempoRandom) {
        this.tiempoRandom = tiempoRandom;
    }

    public void setVida(){
        vida = nivel * tiempoRandom;
    }

    public void revivir(){
        setFechaDeNacimiento(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        nivel = 1; //Reiniciar stats básicos -----------------
        contadorBatallas = 0;
        batallasParaSubirDeNivel = 1;
        contadorComida = 0;
        contPeticionComida = 0;
        cantidadComidasParaMorir = 5;
        contPopo = 0;
        contPeticionPaseo = 0;
        //posicionMascota;
        contadorEnfermedades = 0;
    }

    public int getDineroGanado(){ return (10 + (20 * nivel) + (random.nextInt(15-1)+1)); }

    public void SubirNivel(){
        if (batallasParaSubirDeNivel == contadorBatallas){
            nivel = nivel + 1;
            batallasParaSubirDeNivel = (random.nextInt(15-5)+5) * nivel;
            JOptionPane.showMessageDialog(null, "¡" + nombrePokemon + " ha subido de nivel!");
        }
    }

    public boolean alimentar(Comida comida, int contadorDisponibilidad){
        if (contadorDisponibilidad >= 1){
            contPeticionComida = 0;
            cantidadComidasParaMorir = comida.getComidasParaMorir();
            contadorComida = contadorComida + 1;
            JOptionPane.showMessageDialog(null, "¡Le diste una manzana!");
            return true;
        }else {
            JOptionPane.showMessageDialog(null, "No tiene manzanas para dar :c");
            return false;
        }

    }

    public boolean curar(Medicina medicina, int contadorVitaminasDisp){
        if(contadorEnfermedades > 0){
            if (contadorVitaminasDisp >= 1){
                contadorEnfermedades = contadorEnfermedades - medicina.getCurarEnfermedades();
                alerta("Le diste vitaminas, curaste 1 enfermedad");
                return true;
            }else {
                alerta("No tiene vitaminas para dar :c");
                return false;
            }

        } else {
            alerta("No hay enfermedades que curar :3");
            return false;
        }

    }

    public void alerta(String mensaje){JOptionPane.showMessageDialog(null, mensaje);}

}
