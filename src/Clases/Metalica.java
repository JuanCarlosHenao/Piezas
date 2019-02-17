package Clases;

public class Metalica extends Pieza {

	public Metalica(String codigo, String descripcion, double peso) {
		super(codigo, descripcion, peso);
	}

	@Override
	public double calcPrecio() {
		return 2.8*peso+56;
	}

	
}
