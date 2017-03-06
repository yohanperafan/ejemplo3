package co.edu.ims.pruebas;

import co.edu.ims.modelo.Genero;
import co.edu.ims.modelo.Pelicula;
import co.edu.ims.modelo.Persona;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppMain {
    
    public static void main (String[] args){
        
        EntityManagerFactory emf;
        EntityManager em; 
        
        emf = Persistence.createEntityManagerFactory("peliculasPU");        
        em = emf.createEntityManager();
        
        // Se crea objeto en memoria (sin persistir aun).
        Genero accion = new Genero("Accion", "Peliculas de accion");
        Genero misterio = new Genero("Misterio", "Peliculas de Misterio");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(accion); // Se persiste objeto en base de datos.
        em.persist(misterio);
        tx.commit();
        
        // Se crea objeto en memoria (sin persistir aun).
        Persona guillermoDelToro = new Persona(
                "Guillermo del Toro", 
                "MX",
                (new GregorianCalendar(1964, 9, 9)).getTime() );
        
        tx.begin();
        em.persist(guillermoDelToro); // Se persiste objeto en base de datos.
        tx.commit();
        
        // otra persona
        
        Persona alexdelaiglesia = new Persona(
                "Alex de la Iglesia", 
                "MX",
                (new GregorianCalendar(1964, 9, 9)).getTime() );
        
        tx.begin();
        em.persist(alexdelaiglesia); // Se persiste objeto en base de datos.
        tx.commit();
        
        Pelicula laberintoDelFauno = new Pelicula ("Laberinto del fauno", guillermoDelToro);
        
        laberintoDelFauno.getGeneros().add(accion);
        laberintoDelFauno.getGeneros().add(misterio);
        
        tx.begin();
        em.persist(laberintoDelFauno); 
        tx.commit();
        
        
         Pelicula habitacionDelnino = new Pelicula ("La Habitacion del niño", alexdelaiglesia);
         habitacionDelnino.getGeneros().add(misterio);
        
        tx.begin();
        em.persist(habitacionDelnino); 
        tx.commit();
        // Se crea objeto en memoria (sin persistir aun).
        Genero romance = new Genero("Romance", "Peliculas de romance");
    }
    
}
