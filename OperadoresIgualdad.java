
public class OperadoresIgualdad {

	public static void main(String[] args) {
		
		//Operador de igualdad sirve comparar dos cantidades
		
//		var a = 3;
//		var b = 4;
//		
//		var c = (a==b);
//		
//		System.out.println(c);
//		
//		//Operador diferente de
//		
//		var d = (a != b);
//		
//		System.out.println("d = " + d);
//		
		
		//cuando comparamos cadenas
		
		var cadena = "hola";
		
		var cadena2 = "hola";
		
		var j = cadena == cadena2; //Aqui hacemos referencia es a la memoria del objeto
		
		System.out.println("j = " + j);
		
		var f = cadena.equals(cadena2); //con este metodo podemos preguntarnos por el contenido de la cadena
		
		System.out.println("f = " + f);
	}

}
