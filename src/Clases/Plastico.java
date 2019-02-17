package Clases;

public class Plastico extends Pieza {

	public Plastico(String codigo, String tipo, String descripcion, double peso) {
		super(codigo, tipo, descripcion, peso);
	}

	@Override
	public double calcPrecio() {
		return 1.3*peso+30;
	}

	
}
