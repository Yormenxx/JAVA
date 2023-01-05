package clases;

public class PruebaPersona {

	public static void main(String[] args) {
	
		//Esta una forma larga de crear objetos
		ClaseJava persona1;
		
		persona1 = new ClaseJava();
		
		persona1.apellido = "Ortiz";
		
		persona1.nombre = "Juan";
		
		persona1.DesplegarInformacion();
		
		//Forma corta para crear objetos
		
		ClaseJava persona2 = new ClaseJava();
		
		persona2.nombre = "Karla";
		persona2.apellido = "Ortiz";
		
		persona2.DesplegarInformacion();

		
		
		//Para ver la informacion de nuestro objeto
		
		System.out.println("persona2 : " + persona2);
		//Imprime el nombre del parquete el nombre de la clase y la ref en memoria del objeto
		
		
		
		ClaseJava persona3 = new ClaseJava();
		//Pro defecto los valores de objetos es null
		persona3.DesplegarInformacion();
		
	}

}
