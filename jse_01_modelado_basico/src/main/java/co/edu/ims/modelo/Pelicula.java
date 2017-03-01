package co.edu.ims.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Eraso
 */
public class Pelicula {
    
    private String titulo;
    private int anio;
    private List<Genero> generos = new ArrayList<>();

    public Pelicula() {
    }

    public Pelicula(String t, int a) {
        this.titulo = t;
        this.anio = a;        
    }
    
    // Getters y setters...
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }
    
    
}
