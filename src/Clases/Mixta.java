package Clases;

import java.util.Arrays;

public class Mixta extends Pieza {

	

	private Pieza[] ensamble;
	
	

	public Mixta(String codigo, String tipo, String descripcion, double peso, Pieza[] ensamble) {
		super(codigo, tipo, descripcion, peso);
		this.ensamble = ensamble;
	
		
	}

	
	

	
	public Pieza[] getEnsamble() {
		return ensamble;
	}




	public void setEnsamble(Pieza[] ensamble) {
		this.ensamble = ensamble;
	}



	// era para agregar mas piezas al ensamble, pero no dio 
	@Override
	public void addPieza(String tipoPieza) {
		// TODO Auto-generated method stub
		
		if (ensamble==null) {
			ensamble= new Pieza[1];
			
		}else {
			ensamble=Arrays.copyOf(ensamble, ensamble.length+1);
		}
		
		if (tipoPieza.compareTo("METALICA")==0) {
			ensamble[ensamble.length-1]=new Metalica(codigo, tipoPieza, descripcion, peso);
		}else if (tipoPieza.compareTo("PLASTICO")==0) {
			ensamble[ensamble.length-1]=new Plastico(codigo, tipoPieza, descripcion, peso);
			
		}else {
			ensamble[ensamble.length-1]=new Mixta(codigo, tipoPieza, descripcion, peso,ensamble);
		}
		
	
	}

	
	public double calcPrecio() {
		// TODO Auto-generated method stub
		int precio=0;
		for (int i=0; i<ensamble.length;i++) {
			precio+=ensamble[i].calcPrecio();
		}
		return precio;
		
	}
	

}
