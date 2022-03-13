package com.example.batalladelmardecoral;

public class ControlJuego {

    public synchronized void movimiento(Barco barco) {

        if (barco.getPosX() + barco.getMovX() < 0){
            barco.setMovX(1);
            int dado = (int) (Math.random()*2);
            if (dado%2==0){
                barco.setMovY(-1);
            }else{
                barco.setMovY(1);
            }
        }
        if (barco.getPosX() + barco.getMovX() > (904)){
            barco.setMovX(-1);
            int dado = (int) (Math.random()*2);
            if (dado%2==0){
                barco.setMovY(-1);
            }else{
                barco.setMovY(1);
            }
        }
        if (barco.getPosY() + barco.getMovY() < 0){
            barco.setMovY(1);
            int dado = (int) (Math.random()*2);
            if (dado%2==0){
                barco.setMovX(-1);
            }else{
                barco.setMovX(1);
            }
        }
        if (barco.getPosY() + barco.getMovY() > (738)){
            barco.setMovY(-1);
            int dado = (int) (Math.random()*2);
            if (dado%2==0){
                barco.setMovX(-1);
            }else{
                barco.setMovX(1);
            }
        }

        barco.setPosX(barco.getPosX()+barco.getMovX());
        barco.setPosY(barco.getPosY()+barco.getMovY());
    }


}
