/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boleteriacine;

import static com.sun.glass.ui.Cursor.setVisible;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import util.util.FlowController;

/**
 *
 * @author Usuario
 */
public class InicioController implements Initializable {
    
    @FXML
    private Button button;
    @FXML
    private Pane paneInicio;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        
        //FlowController.getInstance().goViewInWindow("Menu");
        
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));
           
        //((Node) event.getSource())).getScene().getWindow().hide();
        //cerrar ventana:
        Node source = (Node) event.getSource();
        Stage stage1 = (Stage) source.getScene().getWindow();
        stage1.close();
            
        Stage stage = new Stage();
        Scene scene = new Scene(root,950,680);
        
        int filas=7;
        int columnas=8;
        
        Button botones[][]= new Button[filas][columnas];

        for( int fila = 0 ; fila < filas; fila++ )
        {
            for( int columna = 0 ; columna < columnas; columna++ )
            {
                //Se crea el boton y se agrega a las celda de la matriz
                botones[fila][columna] = new Button();
                
                botones[fila][columna].setLayoutX(85+columna*40);
                botones[fila][columna].setLayoutY(360+fila*40);
                botones[fila][columna].setPrefSize(35, 20);
               // botones[fila][columna].setOnAction(e -> {
               // botones[fila][columna].setVisible(true);
               // });
  
                 botones[fila][columna].setText(Integer.toString(fila+1)+","+Integer.toString(columna+1));

                 root.getChildren().addAll(botones[fila][columna]);
               
            }
            
        } 
         botones[0][0].setOnAction(e -> { botones[0][0].setOpacity(0.5); });
         botones[0][1].setOnAction(e -> { botones[0][1].setOpacity(0.5); });
         botones[0][2].setOnAction(e -> { botones[0][2].setOpacity(0.5); });
         botones[0][3].setOnAction(e -> { botones[0][3].setOpacity(0.5); });
         botones[0][4].setOnAction(e -> { botones[0][4].setOpacity(0.5); });
         botones[0][5].setOnAction(e -> { botones[0][5].setOpacity(0.5); });
         botones[0][6].setOnAction(e -> { botones[0][6].setOpacity(0.5); });
         botones[0][7].setOnAction(e -> { botones[0][7].setOpacity(0.5); });
         botones[1][0].setOnAction(e -> { botones[1][0].setOpacity(0.5); });
         botones[1][1].setOnAction(e -> { botones[1][1].setOpacity(0.5); });
         botones[1][2].setOnAction(e -> { botones[1][2].setOpacity(0.5); });
         botones[1][3].setOnAction(e -> { botones[1][3].setOpacity(0.5); });
         botones[1][4].setOnAction(e -> { botones[1][4].setOpacity(0.5); });
         botones[1][5].setOnAction(e -> { botones[1][5].setOpacity(0.5); });
         botones[1][6].setOnAction(e -> { botones[1][6].setOpacity(0.5); });
         botones[1][7].setOnAction(e -> { botones[1][7].setOpacity(0.5); });
         botones[2][0].setOnAction(e -> { botones[2][0].setOpacity(0.5); });
         botones[2][1].setOnAction(e -> { botones[2][1].setOpacity(0.5); });
         botones[2][2].setOnAction(e -> { botones[2][2].setOpacity(0.5); });
         botones[2][3].setOnAction(e -> { botones[2][3].setOpacity(0.5); });
         botones[2][4].setOnAction(e -> { botones[2][4].setOpacity(0.5); });
         botones[2][5].setOnAction(e -> { botones[2][5].setOpacity(0.5); });
         botones[2][6].setOnAction(e -> { botones[2][6].setOpacity(0.5); });
         botones[2][7].setOnAction(e -> { botones[2][7].setOpacity(0.5); });
         botones[3][0].setOnAction(e -> { botones[3][0].setOpacity(0.5); });
         botones[3][1].setOnAction(e -> { botones[3][1].setOpacity(0.5); });
         botones[3][2].setOnAction(e -> { botones[3][2].setOpacity(0.5); });
         botones[3][3].setOnAction(e -> { botones[3][3].setOpacity(0.5); });
         botones[3][4].setOnAction(e -> { botones[3][4].setOpacity(0.5); });
         botones[3][5].setOnAction(e -> { botones[3][5].setOpacity(0.5); });
         botones[3][6].setOnAction(e -> { botones[3][6].setOpacity(0.5); });
         botones[3][7].setOnAction(e -> { botones[3][7].setOpacity(0.5); });
         botones[4][0].setOnAction(e -> { botones[4][0].setOpacity(0.5); });
         botones[4][1].setOnAction(e -> { botones[4][1].setOpacity(0.5); });
         botones[4][2].setOnAction(e -> { botones[4][2].setOpacity(0.5); });
         botones[4][3].setOnAction(e -> { botones[4][3].setOpacity(0.5); });
         botones[4][4].setOnAction(e -> { botones[4][4].setOpacity(0.5); });
         botones[4][5].setOnAction(e -> { botones[4][5].setOpacity(0.5); });
         botones[4][6].setOnAction(e -> { botones[4][6].setOpacity(0.5); });
         botones[4][7].setOnAction(e -> { botones[4][7].setOpacity(0.5); });
         botones[5][0].setOnAction(e -> { botones[5][0].setOpacity(0.5); });
         botones[5][1].setOnAction(e -> { botones[5][1].setOpacity(0.5); });
         botones[5][2].setOnAction(e -> { botones[5][2].setOpacity(0.5); });
         botones[5][3].setOnAction(e -> { botones[5][3].setOpacity(0.5); });
         botones[5][4].setOnAction(e -> { botones[5][4].setOpacity(0.5); });
         botones[5][5].setOnAction(e -> { botones[5][5].setOpacity(0.5); });
         botones[5][6].setOnAction(e -> { botones[5][6].setOpacity(0.5); });
         botones[5][7].setOnAction(e -> { botones[5][7].setOpacity(0.5); });
         botones[6][0].setOnAction(e -> { botones[6][0].setOpacity(0.5); });
         botones[6][1].setOnAction(e -> { botones[6][1].setOpacity(0.5); });
         botones[6][2].setOnAction(e -> { botones[6][2].setOpacity(0.5); });
         botones[6][3].setOnAction(e -> { botones[6][3].setOpacity(0.5); });
         botones[6][4].setOnAction(e -> { botones[6][4].setOpacity(0.5); });
         botones[6][5].setOnAction(e -> { botones[6][5].setOpacity(0.5); });
         botones[6][6].setOnAction(e -> { botones[6][6].setOpacity(0.5); });
         botones[6][7].setOnAction(e -> { botones[6][7].setOpacity(0.5); });
                
        stage.setScene(scene);
        stage.setTitle("Boletería Visuales S.A.");
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
