package com.example.batalladelmardecoral;

public class Barco {
    int vida, posX, posY, sonar, velocidad, potenciaFuego;
    int movX = 1;
    int movY = 1;

    public Barco(int vida, int posX, int posY, int sonar, int velocidad, int potenciaFuego) {
        this.vida = vida;
        this.posX = posX;
        this.posY = posY;
        this.sonar = sonar;
        this.velocidad = velocidad;
        this.potenciaFuego = potenciaFuego;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getSonar() {
        return sonar;
    }

    public void setSonar(int sonar) {
        this.sonar = sonar;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPotenciaFuego() {
        return potenciaFuego;
    }

    public void setPotenciaFuego(int potenciaFuego) {
        this.potenciaFuego = potenciaFuego;
    }

    public int getMovX() {
        return movX;
    }

    public void setMovX(int movX) {
        this.movX = movX;
    }

    public int getMovY() {
        return movY;
    }

    public void setMovY(int movY) {
        this.movY = movY;
    }
}
