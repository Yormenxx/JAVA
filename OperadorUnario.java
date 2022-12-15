
public class OperadorUnario {

	public static void main(String[] args) {
		
//		Operador de cambio de signo 
		
		var a = 3;
		
		var b = -a;
		
		System.out.println("a = " + a );
		System.out.println("b =  " + b);
		
		
// 		operador de negacion -- aplica para los boolean
		
		
		var c = true;
		
		var d = !c;
		

		System.out.println("c  = " + c);
		
		System.out.println("d = "+ d);
		
		
		
//  	Operador de incremento
// 		PREINCREMENTO (LLEVA EL SIMBOLO ANTES DE LA VARIABLE)
		
		
		var e = 3;
		
		var f = ++e; //Primero se incrementa la varaible y despues se usa su valor
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
//		POSTINCEMENTO 
		
		var g = 5;
		
		var h = g++; //Primero se usa el valor de la variable y despues se incrementa
		
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		
		
		//Operador de decremento -- es lo mismo que el  de incremento
		
		var i = 3;
		var j = --i;
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		var k = 4;
		var l = k--;
		System.out.println("k = " + k);
		System.out.println("l = " + l);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
