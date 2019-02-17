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
	
	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Solicitud[] getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(Solicitud[] solicitudes) {
		this.solicitudes = solicitudes;
	}

	public Pieza[] getPiezas() {
		return piezas;
	}

	public void setPiezas(Pieza[] piezas) {
		this.piezas = piezas;
	}
	
	
	
// ----- METODOS DE LA CLASE ----- //
	
			// ---------- METODOS DE SOLICITUD
	
	public void aggPieza(Pieza p) {
		if (piezas == null) {
			piezas=new Pieza [1];
			
		}else {
			piezas=Arrays.copyOf(piezas, piezas.length+1);
		}
		
		piezas[piezas.length-1]=p;
		
	}
	
	public void agregarSolicitud(String codigo, String codCliente, String codigoPieza, String descripcion, double peso, String tipo, Date fecha, int cantidad) {
		if(solicitudes == null) {
			solicitudes = new Solicitud[1];
		} else {
			solicitudes = Arrays.copyOf(solicitudes , solicitudes.length+1);
		}
		if (tipo.compareTo("METALICA")==0) {
			Pieza p=new Metalica(codigoPieza, descripcion, tipo, peso);
			aggPieza(p);
			solicitudes[solicitudes.length-1]= new Solicitud(codigo,fecha, cantidad, codCliente, p, tipo);
		} else if(tipo.compareTo("PLASTICO")==0) {
			Pieza p=new Plastico(codigoPieza, descripcion, tipo, peso);
			aggPieza(p);
			solicitudes[solicitudes.length-1]= new Solicitud(codigo,fecha, cantidad, codCliente, p, tipo);
		}
	}
	
	
	public void agregarSolicitudMixta(String codigo, String codCliente, String codigoPieza, String descripcion, double peso, String tipo, Date fecha, int cantidad, Pieza[] ensamble) {
		if(solicitudes == null) {
			solicitudes = new Solicitud[1];
		} else {
			solicitudes = Arrays.copyOf(solicitudes , solicitudes.length+1);
		}
		
		Pieza p=new Mixta(codigoPieza, descripcion, tipo, peso, ensamble);
		aggPieza(p);
		solicitudes[solicitudes.length-1]= new Solicitud(codigo,fecha, cantidad, codCliente, p, tipo);
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
	
	public void eliminarSolicitud(String codigo) throws ESolicitud {
		Solicitud[] solicitudes2;
		solicitudes2 = new Solicitud[solicitudes.length-1];
		int cont = 0 ;
		for(int i = 0 ; i < solicitudes.length; i++) {
			if(solicitudes[i].getCodigo().compareTo(codigo)!=0) {
				solicitudes2[cont]=solicitudes[i]; 
				cont++;
			}
		}
		solicitudes = Arrays.copyOf(solicitudes2, solicitudes2.length);
		throw new ESolicitud("No se pudo eliminar la solicitud");
	}
	
	public double costoSolicitud(String codigoSolicitud) throws ESolicitud {
		Solicitud s = buscarSolicitud(codigoSolicitud);
		Pieza p = s.getPieza();
		double costo = p.calcPrecio()*s.getCantidad();
		return costo;
	
	}
	
	/*public double costoTotalSolicitudes1(String codCliente ) throws CSolicitud, ESolicitud {
		Cliente c=buscarCliente(codCliente);
		double total=0;
		for (int i=0;i<c.getSolicitudes().length;i++) {
			total+=costoSolicitud(c.getSolicitudes()[i].getCodigo());
		}	
		return total;
	}*/
	
	public double costoTotalSolicitudes(String codCliente) throws ESolicitud, CSolicitud {
		double total=0;
		for (int i=0;i<solicitudes.length;i++) {
			if (solicitudes[i].getCodCliente().compareTo(codCliente)==0) {
				total+=costoSolicitud(solicitudes[i].getCodigo());
			}
		}
		return total ;
	}
	
				// ---------- METODOS DE CLIENTES
	public void agregarCliente(String codigo, String nombre, String direccion, String correo, String formaPago) {
		if (clientes == null) {
			clientes = new Cliente[1];
		} else {
			clientes = Arrays.copyOf(clientes, clientes.length+1);
			}
		clientes[clientes.length-1] = new Cliente(codigo, nombre, direccion, correo, formaPago);
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
	
	public void eliminarCliente(String codigo) throws ECliente {
		Cliente[] clientes2;
		clientes2 = new Cliente[clientes.length-1];
		int cont = 0 ;
		for(int i = 0 ; i < clientes.length; i++) {
			if(clientes[i].getCodigo().compareTo(codigo)!=0) {
				clientes2[cont]=clientes[i]; 
				cont++;
			}
		}
		clientes = Arrays.copyOf(clientes2, clientes2.length);
		throw new ECliente("No se pudo borrar el cliente");
	}
	
	
	// FALTA 
	public Cliente buscarVip() throws ESolicitud, CSolicitud {
		double mayor=0;
		
		
		
		for (int i=0;i<clientes.length;i++) {
			if (costoTotalSolicitudes(clientes[i].getCodigo())>mayor) {
				mayor=costoTotalSolicitudes(clientes[i].getCodigo());
			}
		}
		
		for (int i=0;i<clientes.length;i++) {
			if (costoTotalSolicitudes(clientes[i].getCodigo())==mayor) {
				return clientes[i];
			}
		}
		
		return null;
		
	
				// ---------- METODOS DE PIEZA
	}
	
}
