package Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException, ESolicitud, CSolicitud {

		Empresa e = new Empresa("EIA" , "Envigado" );
		
								// CREACION DE CLIENTES
		
		// 	    FORMATO:(codigo ,   nombre  , direccion ,    correo             ,   tipo de pago)
		e.agregarCliente("jk234", "Empresa1", "RioNegro", "correo@juanca.com", "Cheque Ordinario");
		e.agregarCliente("cA193", "Empresa2", "Medellin", "correo@camiloa.com", "Cheque de Empresa");
		e.agregarCliente("Lm412", "Empresa3", "Pereira", "correo@luchom.com", "Cheque Certificado");
		
								// CREACION DE SOLICITUDES
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = format.format(new Date());
		Date date = format.parse ( "2019-02-18" );
		Date date2 = format.parse ( "2019-02-19" );
		Date date3 = format.parse ( "2019-02-29" );
		Date date4 = format.parse ( "2019-02-10" );
		
		// FORMATO      (codSol, codCli  , codPie , descripcion , peso , tipoPie  , fecha , cantidad)  
		e.agregarSolicitud("1",   "jk234", "50", "Tornillo", 20  , "METALICA", date, 5);
		e.agregarSolicitud("2", "cA193", "51", "Tuerca", 30, "PLASTICO", date2, 10);
		e.agregarSolicitud("3", "Lm412", "55", "Tapa", 15, "PLASTICO", date3, 7);
		e.agregarSolicitud("4", "jk234", "53", "Base", 10, "METALICA", date4, 3);
		
		
		
		
		
		
		
									// TEST DE AGREGACION DE CLIENTES
		
		/*for(int i = 0 ; i < e.getClientes().length ; i++) {
			System.out.println(e.getClientes()[i].getCodigo());
		}
		System.out.println("--------------------------");
		try {
			e.eliminarCliente("jk234");
		} catch (ECliente e1) {
			e1.getMessage();
		}
		
		for(int i = 0 ; i < e.getClientes().length ; i++) {
			System.out.println(e.getClientes()[i].getCodigo());
		}
		System.out.println("--------------------------");
		e.agregarCliente("jk234", "Empresa1", "Envigado", "correo@camilogay.com", "Cheque Ordinario");
		for(int i = 0 ; i < e.getClientes().length ; i++) {
			System.out.println(e.getClientes()[i].getCodigo());
		}*/
		
								// TEST DE AGREGACION DE SOLICITUDES
		
		/*for(int i = 0 ; i < e.getSolicitudes().length ; i++) {
			System.out.println(e.getSolicitudes()[i].getPieza());
		}
		System.out.println("--------------------------");
		try {
			e.eliminarSolicitud("1");
		} catch (ESolicitud e1) {
			e1.getMessage();
		}
		for(int i = 0 ; i < e.getSolicitudes().length ; i++) {
			System.out.println(e.getSolicitudes()[i].getPieza());
		}
		System.out.println("--------------------------");
		e.agregarSolicitud("2", "jk234", "51", "camilo loca	", 30, "PLASTICO", date2, 10);
		for(int i = 0 ; i < e.getSolicitudes().length ; i++) {
			System.out.println(e.getSolicitudes()[i].getPieza());
		}*/
		
							// TEST DE PIEZAS 
		/*
		System.out.println(e.costoSolicitud("2"));
		System.out.println(e.costoSolicitud("1"));
		System.out.println();
		System.out.println(e.costoTotalSolicitudes("jk234"));
		*/
	}

}
