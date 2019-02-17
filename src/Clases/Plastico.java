package Clases;

public class Plastico extends Pieza {

	public Plastico(String codigo, String descripcion, double peso) {
		super(codigo, descripcion, peso);
	}

	@Override
	public double calcPrecio() {
		return 1.3*peso+30;
	}

	
}
