
package domain;


public class Consultor extends Persona{
    
    
    String nom_consultor;
    
    int num_consultor;
    
    
    public Consultor (){
        
    }

    public Consultor(String nom_consultor, int num_consultor, int id, String dni, String nombre, String apellido, String telefono, String domicilio) {
        super(id, dni, nombre, apellido, telefono, domicilio);
        this.nom_consultor = nom_consultor;
        this.num_consultor = num_consultor;
    }

    public String getNom_consultor() {
        return nom_consultor;
    }

    public void setNom_consultor(String nom_consultor) {
        this.nom_consultor = nom_consultor;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
    
    
    
    
    
    
}
