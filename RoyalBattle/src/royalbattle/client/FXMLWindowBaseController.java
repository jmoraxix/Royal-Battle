/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Ricardo Jimenez Rugama
 * José David Mora Loría
 * Luis Alberto Nuñez Reyes
 * Roiner Andres Piedra Madrigal
 * Manuel Alejandro Torres Palomo
 * Fabian Villalobos Hernandez
 * 
 * Royal Battle - Client Side
 * Tercer cuatrimestre, 2016
 */
package royalbattle.client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author jmora
 */
public class FXMLWindowBaseController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
