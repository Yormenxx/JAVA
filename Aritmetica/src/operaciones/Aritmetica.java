package operaciones;

public class Aritmetica {
	
	int a ;
	
	int b;
	
	//constructor vacio
	//Los constructores no devuelven nada , por tanto no usamos void o int u otro dato , el nombre del constructor es
	// el mismo que el de clase
	
	public Aritmetica() {
		
		System.out.println("ejecutando constructor");
	}
	
	//constructor con parametros
	public Aritmetica(int arg1, int arg2) {
		
		this.a = arg1;
		this.b = arg2;
		
		System.out.println("Ejecutando el constructor con argumentos");
	}
	

	public void suma() {
		
		int resultado = a + b;
		System.out.println("resultado desde un metodo con syso = " + resultado);
	}
	
	public int sumaRetorno () {
		
		int resultado = a + b;
		return resultado;
	}
	
	public int sumaArgumento(int arg1, int arg2){
		
		a = arg1;
		
		b = arg2;
		
		return a + b;
		
		
	}

}
