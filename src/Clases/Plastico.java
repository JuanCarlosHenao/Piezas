package Clases;

public class Plastico extends Pieza {

	public Plastico(String codigo, String descripcion, double peso) {
		super(codigo, descripcion, peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcPrecio() {
		// TODO Auto-generated method stub
		return 1.3*peso+30;
	}

	
}
