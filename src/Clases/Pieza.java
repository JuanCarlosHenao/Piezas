package Clases;

public abstract class Pieza {

// ----- DEFINICION DE LOS ATRIBUTOS DE LA CLASE ----- //
<<<<<<< HEAD
	private String codigo , descripcion ;
	private double peso;
	
=======
	private String codigo;
	private String descripcion;
	protected double peso;
	public Pieza(String codigo, String descripcion, double peso) {

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
	
	public abstract double calcPrecio();
	
	

>>>>>>> 6d273a1d878ec25ac9f77dedf27d22d03857c721
}
