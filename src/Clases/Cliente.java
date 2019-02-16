package Clases;

public class Cliente {
	
	private String codigo;
	private String nombre;
	private String direccion;
	private String correo;
	private String formaPago;
	private boolean VIP;
	private Solicitud[] solicitudes;
	
	public Cliente(String codigo, String nombre, String direccion, String correo, String formaPago, boolean vIP,
			Solicitud[] solicitudes) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
		this.formaPago = formaPago;
		VIP = vIP;
		this.solicitudes = solicitudes;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public boolean isVIP() {
		return VIP;
	}

	public void setVIP(boolean vIP) {
		VIP = vIP;
	}

	public Solicitud[] getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(Solicitud[] solicitudes) {
		this.solicitudes = solicitudes;
	}
	
	
	
	

}
