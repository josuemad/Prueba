/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boleteriacine;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Josue
 */
public class MenuController implements Initializable {

    @FXML
    private ImageView Peli1;
    @FXML
    private ImageView Peli2;
    @FXML
    private ImageView Peli3;
    @FXML
    public Label S1;
    @FXML
    public Label S2;
    @FXML
    public Label S3;
    @FXML
    private Label titulo1;
    @FXML
    private Label director1;
    @FXML
    private Label disponibles1;
    @FXML
    private Label titulo2;
    @FXML
    private Label director2;
    @FXML
    private Label disponibles2;
    @FXML
    private Label titulo3;
    @FXML
    private Label director3;
    @FXML
    private Label disponibles3;
    @FXML
    private Label disp;
    @FXML
    private Label rese;
    @FXML
    private Label nomb;
    @FXML
    private Label ed;
        
    @FXML
    private TextField nombCom;
    @FXML
    private TextField edad;
    @FXML
    private Button reserva;
    @FXML
    private Label estado;
    @FXML
    private Label ed1;
    @FXML
    private Label ed2;
    @FXML
    private Label ed3;





    /**
     * Initializes the controller class.
     */
    public static ArrayList<Pelicula> salas = new ArrayList<Pelicula>();
    @FXML
    private Label lbNumeros;
    @FXML
    private Text txtLetras;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Pelicula num1= new Pelicula(1,"Fast & Furious", 2500, 137, 12, "David Leitch", "https://cuevana3.io/19345/fast-furious-hobbs-shaw");
        Pelicula num2= new Pelicula(2,"Hasta el ultimo hombre", 2500, 139, 12, "Mel Gibson", "https://cuevana3.io/19345/fast-furious-hobbs-shaw");
        Pelicula num3= new Pelicula(3,"Star Wars: El ascenso de Skywalker", 2500, 142, 12, "J. J. Abrams", "https://cuevana3.io/19345/fast-furious-hobbs-shaw");
        salas.add(num1);
        salas.add(num2);
        salas.add(num3);
        
           // Prueba 
        System.out.println("ESTO ES SOLO UNA PRUEBA");
        for (Sala sala : salas) {
            System.out.print("\nTitulo de la pelicula:" + sala.getNomPeli() +"  " + "Numero de sala:" + sala.getNumSala());
        }
        
        System.out.print("\n"+num1.getNomPeli()+"\n");
        
        System.out.println("Planificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
        System.out.print(num1.getNomPeli() + " " + num1.getNumSala());
        ((Pelicula) num1).plani();

        //Setear valores a labels
        S1.setText("Sala1");
        S2.setText("Sala2");
        S3.setText("Sala3");

        
        titulo1.setText(num1.nomPeli);
        titulo2.setText(num2.nomPeli);
        titulo3.setText(num3.nomPeli);
        
        //Pelicula peli = new Pelicula(); 
        //director1.setText(peli.getDirector());
        director1.setText(num1.director);
        director2.setText(num2.director);
        director3.setText(num3.director);
        
        ed1.setText("+"+Integer.toString(num1.getEdadm()));
        ed2.setText("+"+Integer.toString(num2.getEdadm()));
        ed3.setText("+"+Integer.toString(num3.getEdadm()));

        // TODO
    }    

    @FXML
    private void reservarBoletos(ActionEvent event) throws IOException {

        String ed = edad.getText();       
        int conv = Integer.valueOf(ed); 
        Espectador esp1 = new Espectador();
        
        esp1.setNombre(nombCom.getText());
        esp1.setEdad(conv);
        
        if(nombCom.getText().length()==0 || edad.getText().length()==0){
             estado.setText("Llene todos los campos solicitados");           
        }
        else {
        if(conv>=12){
 
            estado.setStyle("-fx-text-fill: greenyellow"); 
            estado.setText(esp1.nombre+ " ha reservado correctamente");
            System.out.print("\n"+esp1.nombre+" "+esp1.edad+ "  Ha reservado correctamente.");
            nombCom.clear();
            edad.clear();
        } else {
            estado.setStyle("-fx-text-fill: red"); 
            estado.setText("No se ha completado la reservacion. \nNO CUMPLE CON LA EDAD MINIMA.");
        }

        }
         
    }

    @FXML
    private void MouseClickImg1(MouseEvent event) throws IOException {
         
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));
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
                botones[fila][columna] = new Button();
                botones[fila][columna].setLayoutX(85+columna*40);
                botones[fila][columna].setLayoutY(360+fila*40);
                botones[fila][columna].setPrefSize(35, 20);
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

    @FXML
    private void MouseClickIm2(MouseEvent event) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));
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
                botones[fila][columna] = new Button();
                botones[fila][columna].setLayoutX(85+columna*40);
                botones[fila][columna].setLayoutY(360+fila*40);
                botones[fila][columna].setPrefSize(35, 20);
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

    @FXML
    private void MouseClickedIm3(MouseEvent event) throws IOException {
        int imag=3;
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));
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
                botones[fila][columna] = new Button();
                botones[fila][columna].setLayoutX(85+columna*40);
                botones[fila][columna].setLayoutY(360+fila*40);
                botones[fila][columna].setPrefSize(35, 20);
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
}


    

    

    

