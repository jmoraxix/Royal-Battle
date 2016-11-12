/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Ricardo Jimenez Rugama
 * José David Mora Loría
 * Luis Alberto Nuñez Reyes
 * Roiner Andres Piedra Madrigal
 * Fabian Andres Vargas Chavarria
 * 
 * Royal Battle
 * Tercer cuatrimestre, 2016
 */
package royalbattle.client;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import royalbattle.client.util.Util;

/**
 *
 * @author jmora
 */
public class RoyalBattleClient extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        stage.setMaxHeight(Util.HEIGHT);
        stage.setMaxWidth(Util.WIDTH);
        stage.setMinHeight(Util.HEIGHT);
        stage.setMinWidth(Util.WIDTH);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, Util.WIDTH, Util.HEIGHT);
        stage.setScene(scene);

        Label scenetitle = new Label("¡Bienvenido!");
        scenetitle.setId("titulo1");
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Ingrese su nombre de usuario:");
        grid.add(userName, 0, 1, 2, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 2, 1);

        Button btnCrearPartida = new Button("Partida nueva");
        HBox hbBtnCP = new HBox(15);
        hbBtnCP.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnCP.getChildren().add(btnCrearPartida);
        grid.add(hbBtnCP, 0, 4);

        btnCrearPartida.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(stage);
                VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(new Text("This is a Dialog"));
                Scene dialogScene = new Scene(dialogVbox, 300, 200);
                dialog.setScene(dialogScene);
                dialog.show();
            }
        });

        Button btnIngresarPartida = new Button("Ingresar a partida");
        HBox hbBtnIP = new HBox(15);
        hbBtnIP.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnIP.getChildren().add(btnIngresarPartida);
        grid.add(hbBtnIP, 3, 4);

        btnIngresarPartida.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            }
        });

        stage.setTitle("Royal Battle");
        stage.setScene(scene);
        scene.getStylesheets().add(RoyalBattleClient.class.getResource("view/css/base.css").toExternalForm());
        scene.getStylesheets().add(RoyalBattleClient.class.getResource("view/css/login.css").toExternalForm());
        stage.show();
    }
}
