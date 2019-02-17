package Clases;

public class Metalica extends Pieza {

	public Metalica(String codigo, String tipo , String descripcion, double peso) {
		super(codigo, tipo, descripcion, peso);
	}

	public double calcPrecio() {
		return 2.8*peso+56;
	}
	
}
