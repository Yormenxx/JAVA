package clases;

public class ClaseJava {
	
	//Atributos de la clase
	
	String nombre;
	
	String apellido;
	
	//Para definir un método 
	// void indica que no regresa nada
	
	public void DesplegarInformacion() {
		
		System.out.println("Nombre : " + nombre);
		
		System.out.println("Apellido : " + apellido);
	}
	
	//Las pruebas de clases es mejor hacerlas fuera de la clase , hay que crear otra clase
	


}



/*
 * 
 * Cuando nosotros creamos un nevo paquete , por defecto aparecera PACKAGE {NOMBRE PAQUETE}
 * 
 * La clase aparecera en el public class
 * 
 */