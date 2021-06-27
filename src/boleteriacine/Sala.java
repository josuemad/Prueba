/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boleteriacine;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Josue
 */
public abstract class Sala implements FuncionesSala {
    
    protected int numSala;
    protected String nomPeli;
    protected int precio;
    
 // constructores, getter y setter 
    public Sala(int pNumSala, String pNomPeli, int pPrecio) {
        this.numSala = pNumSala;
        this.nomPeli = pNomPeli;
        this.precio = pPrecio;
    }
    
    public Sala(){
        numSala=0;
        nomPeli= " ";
        precio= 0;      
    }
    public int getNumSala() {
        return numSala;
    }

    public void setId(int numSala) {
        this.numSala = numSala;
    }

    public String getNomPeli() {
        return nomPeli;
    }

    public void setNomPeli(String nomPeli) {
        this.nomPeli = nomPeli;
    }
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void reservar() {
        System.out.println("reservando");
    }

    @Override
    public void MostrarDisponible() {
        System.out.println("Mostrando campos disponibles");
    }

    @Override
    public void MostrarPelicula() {
        System.out.println("Mostrando pelicula");
        
    }

}

