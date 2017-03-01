package co.edu.ims.modelo;

public class Genero {
    
    // Atributos
    private String codigo;
    
    // Constructores
    public Genero(){};    
    public Genero(String c){
        this.codigo = c;
    }
    
    //Getters y setters...
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
