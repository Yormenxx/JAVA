import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {


//		var numero = 2;
//		
//		var numeroTexto = "valor desconocido";
//		
//		switch(numero) {
//		
//		case 1:
//			
//			numeroTexto = "numero uno";
//			break;
//			
//		case 2:
//			
//			numeroTexto= "numero dos";
//			break;
//			
//		case 3:
//			
//			numeroTexto= "numero tres";
//			break;
//			
//			
//		case 4:
//	
//			numeroTexto= "numero cuatro";
//			break;
//			
//		default:
//			numeroTexto="caso no encontrado";
//		}
//		
//
//			
//		System.out.println(numeroTexto);
//		
//		
//		
//		
//		
		
		
//		var mes = 14;
//		
//		var textoEstacion  = "Estación desconocida";
//		
//		switch(mes) {
//		
//		case 1: case 2: case 12:
//			
//			textoEstacion = "Estacion invierno";
//			break;
//			
//		case 3: case 4: case 5:
//			
//			textoEstacion = "Estacion primavera";
//			break;
//			
//		case 6: case 7: case 8:
//			
//			textoEstacion = "Estacion verano";
//			break;
//			
//		case 9: case 10: case 11:
//			
//			textoEstacion = "Estacion otoño";
//			break;
//			
//		default:
//			
//			textoEstacion = "Mes o estación desconocido";
//		
//		}
//		
//		
//		System.out.println(textoEstacion);
//		
//		
//		
		
		//Sistema de calificaciones
		
		
//		El usuario proporcionará un valor entre 0 y 10.
//
//		Si está entre 9 y 10: imprimir una A
//
//		Si está entre 8 y menor a 9: imprimir una B
//
//		Si está entre 7 y menor a 8: imprimir una C
//
//		Si está entre 6 y menor a 7: imprimir una D
//
//		Si está entre 0 y menor a 6: imprimir una F
//
//		cualquier otro valor debe imprimir: Valor desconocido
		
		
		System.out.println("Bienvenido al sistema de calificaciones");
		System.out.println("---------------------------------------");
		
		System.out.println("Ingrese su calificación" );
		
		Scanner consola = new Scanner (System.in);
		
		var calificacion = consola.nextInt();
		
		
		if(calificacion <=10 && calificacion>=0 ) {
			
			
			if(calificacion <=10 && calificacion>=9 ) {
				
				System.out.println("felicitaciones obtuviste una A\n calificacion: " + calificacion);
				
			
			}else if (calificacion <=9 && calificacion>=8) {
				
				System.out.println("felicitaciones obtuviste una B\n calificacion: " + calificacion);
				
				
			}else if (calificacion <=8 && calificacion>=7) {
			
				System.out.println("felicitaciones obtuviste una C\n calificacion: " + calificacion);
				
			}else if(calificacion <=7 && calificacion>=6) {
				
				System.out.println("felicitaciones obtuviste una D\n calificacion: " + calificacion);
				
			}else if(calificacion <=6 && calificacion>=0) {
				
				System.out.println("Obtuviste una f\n calificacion: " + calificacion);
				
			}
		
		
		}else {
			
			System.out.println("La calificacion que ingresaste no es valida");
		}
		

	}

}
