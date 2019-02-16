package Clases;

public class Metalica extends Pieza {

	public Metalica(String codigo, String descripcion, double peso) {
		super(codigo, descripcion, peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcPrecio() {
		// TODO Auto-generated method stub
		return 2.8*peso+56;
	}

	
}
