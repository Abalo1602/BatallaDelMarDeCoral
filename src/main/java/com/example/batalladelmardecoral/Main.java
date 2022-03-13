package com.example.batalladelmardecoral;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main extends Application {

    static ImageView fondoMar;
    static ImageView rojo1;
    static ImageView rojo2;
    static ImageView rojo3;
    static ImageView rojo4;
    static ImageView verde1;
    static ImageView verde2;
    static ImageView verde3;
    static ImageView verde4;

    static {
        try {
            fondoMar = new ImageView(new Image(new FileInputStream("src/main/resources/Imagenes/Mar.jpg")));
            rojo1 = new ImageView(new Image(new FileInputStream("src/main/resources/Imagenes/DestructorRojo.png")));
            rojo2 = new ImageView(new Image(new FileInputStream("src/main/resources/Imagenes/AcorazadoRojo.png")));
            rojo3 = new ImageView(new Image(new FileInputStream("src/main/resources/Imagenes/SubmarinoRojo.png")));
            rojo4 = new ImageView(new Image(new FileInputStream("src/main/resources/Imagenes/LanchaRojo.png")));
            verde1 = new ImageView(new Image(new FileInputStream("src/main/resources/Imagenes/DestructorVerde.png")));
            verde2 = new ImageView(new Image(new FileInputStream("src/main/resources/Imagenes/AcorazadoVerde.png")));
            verde3 = new ImageView(new Image(new FileInputStream("src/main/resources/Imagenes/SubmarinoVerde.png")));
            verde4 = new ImageView(new Image(new FileInputStream("src/main/resources/Imagenes/LanchaVerde.png")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("tablero-vista.fxml"));
        root.getChildren().addAll(fxmlLoader.load(), fondoMar, rojo1, rojo2, rojo3, rojo4, verde1, verde2, verde3, verde4);

        Scene scene = new Scene(root, 1280, 768);

        stage.setTitle("Batalla del Mar de Coral");
        stage.setScene(scene);
        stage.show();

        fondoMar.setLayoutX(0);
        fondoMar.setLayoutY(0);
        fondoMar.setFitWidth(1024);
        fondoMar.setFitHeight(768);

        rojo1.setLayoutX(0);
        rojo1.setLayoutY(150);
//        rojo1.setFitWidth(1024);
//        rojo1.setFitHeight(768);

        rojo2.setLayoutX(0);
        rojo2.setLayoutY(300);
//        rojo2.setFitWidth(1024);
//        rojo2.setFitHeight(768);

        rojo3.setLayoutX(0);
        rojo3.setLayoutY(450);
//        rojo3.setFitWidth(1024);
//        rojo3.setFitHeight(768);

        rojo4.setLayoutX(0);
        rojo4.setLayoutY(600);
//        rojo4.setFitWidth(1024);
//        rojo4.setFitHeight(768);

        verde1.setLayoutX(900);
        verde1.setLayoutY(150);
//        verde1.setFitWidth(1024);
//        verde1.setFitHeight(768);

        verde2.setLayoutX(900);
        verde2.setLayoutY(300);
//        verde2.setFitWidth(1024);
//        verde2.setFitHeight(768);

        verde3.setLayoutX(900);
        verde3.setLayoutY(450);
//        verde3.setFitWidth(1024);
//        verde3.setFitHeight(768);

        verde4.setLayoutX(900);
        verde4.setLayoutY(600);
//        verde4.setFitWidth(1024);
//        verde4.setFitHeight(768);


    }

    public static void main(String[] args) {
        launch();
    }

    public static synchronized void repintaRojo1 (Barco barco) {
        rojo1.setLayoutX(barco.getPosX());
        rojo1.setLayoutY(barco.getPosY());
    }

    public static synchronized void repintaRojo2(Barco barco) {
        rojo2.setLayoutX(barco.getPosX());
        rojo2.setLayoutY(barco.getPosY());
    }

    public static synchronized void repintaRojo3(Barco barco) {
        rojo3.setLayoutX(barco.getPosX());
        rojo3.setLayoutY(barco.getPosY());
    }

    public static synchronized void repintaRojo4(Barco barco) {
        rojo4.setLayoutX(barco.getPosX());
        rojo4.setLayoutY(barco.getPosY());
    }

    public static synchronized void repintaVerde1(Barco barco) {
        verde1.setLayoutX(barco.getPosX());
        verde1.setLayoutY(barco.getPosY());
    }

    public static synchronized void repintaVerde2(Barco barco) {
        verde2.setLayoutX(barco.getPosX());
        verde2.setLayoutY(barco.getPosY());
    }

    public static synchronized void repintaVerde3(Barco barco) {
        verde3.setLayoutX(barco.getPosX());
        verde3.setLayoutY(barco.getPosY());
    }

    public static synchronized void repintaVerde4(Barco barco) {
        verde4.setLayoutX(barco.getPosX());
        verde4.setLayoutY(barco.getPosY());
    }

}