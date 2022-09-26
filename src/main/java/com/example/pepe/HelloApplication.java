package com.example.pepe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        stage.setTitle("Hello!");
        GridPane panel =new GridPane();
        VBox layoutVertical=new VBox();
        Button btnaceptar=new Button();
        btnaceptar.setText("Aceptar");
        Button btncancelar=new Button();
        btncancelar.setText("Cancelar");
        HBox layoutHoriNombre=new HBox();
        Label lblNombre=new Label();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);

        grid.add(new Label("Nombr"),0,0);
        grid.add(new TextField(),1,0);
        grid.add(new Label("Edad"),0,1);
        grid.add(new TextField(),1,1);
        grid.add(new Button("Aceptar"),1,2);
        grid.add(new Button("Cancelar"),2,2);


        VBox escenaP =new VBox();
        TextField caja1=new TextField();
        Label textoNombre=new Label("Nombre");
        TextField caja2=new TextField();
        Label textoApellido=new Label("Apellido");

        HBox linea1 =new HBox(textoNombre,caja1);
        HBox linea2 =new HBox(textoApellido,caja2);
        HBox linea3=new HBox(btnaceptar,btncancelar);

        Scene scene = new Scene(escenaP, 600, 400);
        stage.setScene(scene);
        stage.show();

        escenaP.getChildren().addAll(linea1,linea2,linea3,grid);


        linea1.setSpacing(30);
        linea1.setAlignment(Pos.CENTER);
        linea2.setSpacing(30);
        linea2.setAlignment(Pos.CENTER);
        linea3.setSpacing(50);
        linea3.setAlignment(Pos.CENTER);
    }

    public static void main(String[] args) {
        launch();
    }
}