package Cubo;

public class PruebasCubo {

	public static void main(String[] args) {
	
		
		System.out.println("Ejecuanto el codigo");
		System.out.println("-------------------");
		
		Cubo prueba1 = new Cubo();
		
		prueba1.ancho = 3;
		prueba1.largo = 6;
		prueba1.profundo = 6;
		
		System.out.println("resultado = " + prueba1.calculoCubo());
		
		
		System.out.println("Ejecutando el codigo 2");
		System.out.println("-------------------");
		
		Cubo prueba2 = new Cubo(3,2,6);
		
		System.out.println("resultado = " + prueba2.calculoCubo());
		


	}

}
