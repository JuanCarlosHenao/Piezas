package Clases;

import java.util.Arrays;
import java.util.Date;

public class Empresa {

// ----- DEFINICION DE LOS ATRIBUTOS DE LA CLASE ----- //
	private String nombre , direccion ;
	private Cliente[] clientes ;
	private Solicitud[] solicitudes ;
	private Pieza[] piezas ;
	

// ----- GETTERS & SETTERS DE LA CLASE ----- //
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Empresa(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	
// ----- METODOS DE LA CLASE ----- //
	
			// METODOS DE SOLICITUD
	
	public void agregarSolicitud(String codigo, String codigoPieza, Date fecha, int cantidad) {
		if(solicitudes == null) {
			solicitudes = new Solicitud[1];
		} else {
			solicitudes = Arrays.copyOf(solicitudes , solicitudes.length+1);
		}
		solicitudes[solicitudes.length-1]= new Solicitud(codigo, codigoPieza, fecha, cantidad);
	}	
	
	public Solicitud buscarSolicitud(String codigo) throws ESolicitud {
		int i = 0;
		while(i < solicitudes.length) {
			if(solicitudes[i].getCodigo().compareTo(codigo)==0) {
				return solicitudes[i];
			} else
				i++;
		}
		throw new ESolicitud("No se encontró la solicitud.");
	}

	
			// METODOS DE CLIENTES
	public void agregarCliente(String codigo, String nombre, String direccion, String correo) {
		if (clientes == null) {
			clientes = new Cliente[1];
		} else {
			clientes = Arrays.copyOf(clientes, clientes.length+1);
			}
		clientes[clientes.length-1] = new Cliente(codigo, nombre, direccion, correo);
	}
	
	public Cliente buscarCliente(String codigo) throws CSolicitud {
		int i = 0 ;
		while(i < clientes.length) {
			if(clientes[i].getCodigo().compareTo(codigo)==0) {
				return clientes[i] ;
			} else
				i++;
		}
		throw new CSolicitud("No se encontró el cliente.");
	}
	
	public void eliminarCliente(String codigo, String nombre, String direccion , String correo) throws ECliente {
		Cliente[] clientes2;
		clientes2 = new Cliente[clientes.length-1];
		int cont = 0 ;
		for(int i = 0 ; i < clientes.length; i++) {
			if(clientes2[i].getCodigo().compareTo(codigo)!=0) {
				clientes2[cont]=clientes[i]; 
				cont++;
			}
		}
		clientes = Arrays.copyOf(clientes2, clientes2.length);
	}
	
}
