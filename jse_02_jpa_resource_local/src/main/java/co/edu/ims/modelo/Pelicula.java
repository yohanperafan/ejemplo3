/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author 1061757909
 */
@Entity
public class Pelicula {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    
    @ManyToOne
    @JoinColumn(name = "fk_director")
    private Persona director;
    
    @ManyToMany
    @JoinTable(name="pelicula_genero", joinColumns = @JoinColumn(name="pelicula_id"),
            inverseJoinColumns=@JoinColumn(name="genero_id"))
    private List<Genero> generos = new ArrayList<>();
    
    public Pelicula(){
        
    }
    
    public Pelicula(String t,Persona d){
       
        this.titulo = t;
        this.director=d;    
    }
    
    // Getters & Setters
    
    public Long getId(){
        return id;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public Persona getDirector(){
        return director;
    }
    
    public void setId(Long id){
        this.id=id;
    }
    
     public void setTitulo(String titulo){
        this.titulo=titulo;
    }
     
     public void setDirector(Persona director){
        this.director=director;
    } 

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }
    
     
            
            
         
    
}
