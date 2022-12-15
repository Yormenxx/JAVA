import java.util.Scanner;

public class Pedir_datos {

	public static void main(String[] args) {
		System.out.println("Escribe tu nombre");
		
		Scanner consola = new Scanner(System.in);
		
		var nombre = consola.nextLine();
		
		System.out.println("tu nombre es ; " + nombre);
		
		System.out.println("Escribe tu titulo ");
		
		var titulo = consola.nextLine();
		
		System.out.println("Eres : " + nombre + " y tu titulo es: " + titulo);
	}

}
