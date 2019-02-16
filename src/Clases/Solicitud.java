package Clases;

import java.util.*;

public class Solicitud {

// ----- DEFINICION DE LOS ATRIBUTOS DE LA CLASE ----- //
	private String codigo , codigoPieza;
	private Date fecha ;
	private int cantidad ;
	
// ----- GETTERS & SETTERS ----- //
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoPieza() {
		return codigoPieza;
	}

	public void setCodigoPieza(String codigoPieza) {
		this.codigoPieza = codigoPieza;
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

	public Solicitud(String codigo, String codigoPieza, Date fecha, int cantidad) {
		this.codigo = codigo;
		this.codigoPieza = codigoPieza;
		this.fecha = fecha;
		this.cantidad = cantidad;
	}
	
}
