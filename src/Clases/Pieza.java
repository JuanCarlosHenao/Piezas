package Clases;

abstract class Pieza {

// ----- DEFINICION DE LOS ATRIBUTOS DE LA CLASE ----- //
	protected String codigo;
	protected String descripcion;
	protected double peso;
	protected String tipo;
	
// ----- GETTERS & GETTERS ----- //
	public Pieza(String codigo, String tipo, String descripcion, double peso) {
		this.tipo = tipo;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.peso = peso;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
// ----- METODOS DE LA CLASE PIEZA ----- //
	
	
	public abstract double calcPrecio();
	public void addPieza(String tipoPieza) {
		
	}
	
	

}
