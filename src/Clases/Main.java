package Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException, ESolicitud, ECliente {

		Empresa e = new Empresa("EIA" , "Envigado" );
		
		// CREACION DE CLIENTES
		e.agregarCliente("jk234", "Empresa1", "Envigado", "correo@camilogay.com", "Cheque Ordinario");
		e.agregarCliente("mk69", "Empresa2", "Medellin", "correo@juancagay.com", "Cheque de Empresa");
		e.agregarCliente("oe54ld", "Empresa3", "Pereira", "correo@luchoelmacho.com", "Cheque Certificado");
		
		// CREACION DE SOLICITUDES
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = format.format(new Date());
		Date date = format.parse ( "2019-02-18" );    
		e.agregarSolicitud("c0d1g0", "123", date, 4);
		//System.out.println("test " + e.buscarSolicitud("c0d1g0").getCodigo() );
		
		
		System.out.println(e.getClientes());
		e.eliminarCliente("jk234");
	}

}
