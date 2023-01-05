package Cubo;

public class Cubo {
	
	int ancho;
	int largo;
	int profundo;
	
	public Cubo() {
		
	}
	
	public Cubo(int ancho, int largo, int profundo) {
	
		this.ancho = ancho;
		this.largo= largo;
		this.profundo = profundo;
			
		
	}
	
	public int calculoCubo() {
		
		int resultado = ancho* largo* profundo;
		return resultado;
	}
	
	
	

}
