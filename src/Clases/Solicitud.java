package Clases;

import java.util.*;

public class Solicitud {

// ----- DEFINICION DE LOS ATRIBUTOS DE LA CLASE ----- //
	private String codigo;
	private Date fecha ;
	private int cantidad ;
	private String codCliente ;
	private Pieza pieza;
	private String tipo;
	
	public Solicitud(String codigo, String codCliente , String tipo , Date fecha, int cantidad) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.codCliente = codCliente;
	}
	
	public Solicitud(String codigo, Date fecha, int cantidad, String codCliente, Pieza pieza, String tipo) {
		this.codigo = codigo;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.codCliente = codCliente;
		this.pieza = pieza;
		this.tipo = tipo;
	}
	
// ----- GETTERS & SETTERS ----- //
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public Pieza getPieza() {
		return pieza;
	}


	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	} 
	
	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	
	
}
