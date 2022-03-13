package com.example.batalladelmardecoral;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;

import static java.lang.Thread.sleep;

public class MainController {

    @FXML
    private Button btnComienzo;

    @FXML
    private ProgressBar pbRojo1;

    @FXML
    private ProgressBar pbRojo2;

    @FXML
    private ProgressBar pbRojo3;

    @FXML
    private ProgressBar pbRojo4;

    @FXML
    private ProgressBar pbVerde1;

    @FXML
    private ProgressBar pbVerde2;

    @FXML
    private ProgressBar pbVerde3;

    @FXML
    private ProgressBar pbVerde4;

    Barco rojo1 = new Barco(80,0,150,15,5,50);
    Barco rojo2 = new Barco(120,0,300,20,3,80);
    Barco rojo3 = new Barco(30,0,450,30,2,60);
    Barco rojo4 = new Barco(10,0,600,12,10,20);

    Barco verde1 = new Barco(80,900,150,15,5,50);
    Barco verde2 = new Barco(120,900,300,20,3,80);
    Barco verde3 = new Barco(30,900,450,30,2,60);
    Barco verde4 = new Barco(10,900,600,12,10,20);

    ControlJuego controlJuego = new ControlJuego ();

    @FXML
    void onClikComenzar(ActionEvent event) {

        System.out.println("Estoy aquí");

        Thread thRojo1 = new Thread(()->{
            while (rojo1.getVida()>0){
                controlJuego.movimiento(rojo1);
                Main.repintaRojo1(rojo1);
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thRojo1.start();

        Thread thRojo2 = new Thread(()->{
            while (rojo2.getVida()>0){
                controlJuego.movimiento(rojo2);
                Main.repintaRojo2(rojo2);
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thRojo2.start();

        Thread thRojo3 = new Thread(()->{
            while (rojo3.getVida()>0){
                controlJuego.movimiento(rojo3);
                Main.repintaRojo3(rojo3);
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thRojo3.start();

        Thread thRojo4 = new Thread(()->{
            while (rojo4.getVida()>0){
                controlJuego.movimiento(rojo4);
                Main.repintaRojo4(rojo4);
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thRojo4.start();

        Thread thVerde1 = new Thread(()->{
            while (verde1.getVida()>0){
                controlJuego.movimiento(verde1);
                Main.repintaVerde1(verde1);
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thVerde1.start();

        Thread thVerde2 = new Thread(()->{
            while (verde2.getVida()>0){
                controlJuego.movimiento(verde4);
                Main.repintaVerde2(verde2);
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thVerde2.start();

        Thread thVerde3 = new Thread(()->{
            while (verde3.getVida()>0){
                controlJuego.movimiento(verde3);
                Main.repintaVerde3(verde3);
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thVerde3.start();

        Thread thVerde4 = new Thread(()->{
            while (verde4.getVida()>0){
                controlJuego.movimiento(verde4);
                Main.repintaVerde4(verde4);
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thVerde4.start();
    }

}