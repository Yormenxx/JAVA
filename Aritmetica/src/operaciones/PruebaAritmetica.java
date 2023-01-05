package operaciones;

public class PruebaAritmetica {

	public static void main(String[] args) {
		
		//varaible locales
		
		int a = 10;
		
		int b = 2;
		
		
		
		Aritmetica aritmetica1 = new Aritmetica();
		
		System.out.println("Atrbiuto a: " + aritmetica1.a);
		System.out.println("Atrbiuto b: " + aritmetica1.b);
		
		System.out.println("Ejecutando el constructor vacio ");
		
		
		
		System.out.println("-------------------");
		
		System.out.println("Constructor con argumentos");
		
		Aritmetica aritmetica2 = new Aritmetica(5,6);
		
		System.out.println("Atrbiuto a: " + aritmetica2.a);
		System.out.println("Atrbiuto b: " + aritmetica2.b);
		
		
		
		
//		aritmetica1.a = 3;
//		aritmetica1.b = 4;
//		
//		aritmetica1.suma();
//
//		int resultado = aritmetica1.sumaRetorno();
//		
//		System.out.println("resultado en retorno o sea con return  =   " + resultado);
//		
//		
//		int resultado1 = aritmetica1.sumaArgumento(5,8);
//		System.out.println("resultado con argumentos = " + resultado1);
	}
	
	//las variables inicializadas dentro de un metodo , no se pueden utilizar dentro de otro
	//Esas son varaible locales
	
	//lo atributos de clase, su alcance es mayor
	
	

}
