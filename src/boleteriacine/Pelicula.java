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
public class Pelicula extends Sala {
    
    public int duracion;
    public int edadm;
    public String director;
    public String url;
    public int pPrecio;
    
    //constructor, getter y setter
    
    public Pelicula(int pNumSala, String pNomPeli, int pPrecio, int duracion, int edadm, String director, String url) {
        super(pNumSala, pNomPeli, pPrecio);
        this.duracion = duracion;
        this.edadm = edadm;
        this.director = director;
        this.url = url;  
    }
    
    Pelicula() {
        this.duracion = 0;
        this.edadm = 0;
        this.director = " ";
        this.url = " "; 
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public int getEdadm() {
        return edadm;
    }

    public void setEdadm(int edadm) {
        this.edadm = edadm;
    }
    
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void plani() {
        System.out.print(duracion);
    }
}
