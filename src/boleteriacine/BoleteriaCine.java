/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boleteriacine;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.util.FlowController;

/**
 *
 * @author Josue
 */
public class BoleteriaCine extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/Inicio.fxml"));
        
        Scene scene = new Scene(root);
        //estilo
        scene.getStylesheets().add(BoleteriaCine.class.getResource("/config/estilos.css").toExternalForm());
        //   
        stage.setScene(scene);
        stage.setTitle("Boletería Visuales S.A.");
        stage.show();
        
       
    }
    
    public static void main(String[] args) {
    

        
        launch(args);
    }
    
}
