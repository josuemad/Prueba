/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boleteriacine;

/**
 *
 * @author Josue
 */
public class Espectador extends Sala{
    
    public String nombre;
    public int edad;
    
    //contructor, sets y gets
    public Espectador(int pNumSala, String pNomPeli, int pPrecio, String nombre, int edad) {
        super(pNumSala, pNomPeli, pPrecio);
        this.nombre = nombre;
        this.edad = edad; 
    }
    
    public Espectador() {
        this.nombre = " ";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
