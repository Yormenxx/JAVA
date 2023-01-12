
package domain;

public class Empleado extends Persona{
    
    
    private int num_legajo;
    
    private String cargo;
    
    private String sueldo;
    
    
    public Empleado(){
        
    }

    public Empleado(int num_legajo, String cargo, int id, String dni, String nombre, String apellido, String telefono, String domicilio) {
        super(id, dni, nombre, apellido, telefono, domicilio);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("num_legajo=").append(num_legajo);
        sb.append(", cargo=").append(cargo);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
