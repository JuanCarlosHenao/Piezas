package Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException, ESolicitud, CSolicitud {

		Empresa e = new Empresa("EIA" , "Envigado" );
		
		// CREACION DE CLIENTES
		e.agregarCliente("jk234", "Empresa1", "Envigado", "correo@camilogay.com", "Cheque Ordinario");
		e.agregarCliente("mk69", "Empresa2", "Medellin", "correo@juancagay.com", "Cheque de Empresa");
		e.agregarCliente("oe54ld", "Empresa3", "Pereira", "correo@luchoelmacho.com", "Cheque Certificado");
		
		// CREACION DE SOLICITUDES
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = format.format(new Date());
		Date date = format.parse ( "2019-02-18" );
		Date date2 = format.parse ( "2019-02-19" );
		Date date3 = format.parse ( "2019-02-29" );
		Date date4 = format.parse ( "2019-02-10" );
		e.agregarSolicitud("1", "jk234", "50", "camilo es gay", 20, "METALICA", date, 5);
		e.agregarSolicitud("2", "jk234", "51", "camilo loca	", 30, "PLASTICO", date2, 10);
		
//		e.agregarSolicitud("c0d1g0", "jk234" , "redondo", date, 4);
//		e.agregarSolicitud("kissf", "jk234" , "cuadrado", date2, 5);
//		e.agregarSolicitud("poeda3", "mk69" , "tornillo", date3, 1);
//		e.agregarSolicitud("gw3hf", "oe54ld" , "camilomarica", date4, 2);
		
		
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
		
		
		// veo que si fucione costo total solicitudes 
		
		System.out.println("costo pieza metalica 112*5 ="+e.costoSolicitud("1"));
		System.out.println("costo pieza plstica 69*10 ="+e.costoSolicitud("2"));
		System.out.println();
		System.out.println(e.costoTotalSolicitudes("jk234"));
		
		
		// creo un ensamble para la  pieza mixta 
		Pieza[] ensamble = new Pieza[2];
		ensamble[0]=e.buscarSolicitud("1").getPieza();
		ensamble[1]=e.buscarSolicitud("2").getPieza();
		
		// CREO UNA SOLICITUD DE PIEZA MIXTA 
		// String codigo, String codCliente, String codigoPieza, String descripcion, double peso, String tipo, Date fecha, int cantidad, Pieza[] ensamble
		e.agregarSolicitudMixta("3", "jk234", "53", "lami", 3,	"MIXTA", date, 10, ensamble);
		
		
		
		System.out.println(e.buscarSolicitud("3").getCodCliente());
		
		// costo total de la mixta es la suma de plastica y metalica 
		System.out.println("costo pieza mixta 181*10 ="+e.costoSolicitud("3"));
		
		
		// costo total de las solicitudes con la pieza mixta 
		System.out.println(e.costoTotalSolicitudes("jk234"));
		
		System.out.println("----------------------------------------------");
		
		
		
		// TEST VIP 
		
		// agrego solicitudes al otro cliente mk69,  que el costo total sea menor al de jk234, y el vip es jk234
		
		
		e.agregarSolicitud("13", "mk69", "50", "camilo es gay", 10, "METALICA", date, 5);
		e.agregarSolicitud("14", "mk69", "51", "camilo loca	", 10, "PLASTICO", date2, 10);
		System.out.println("costo pieza plstica 84*5 ="+e.costoSolicitud("13"));
		System.out.println("costo pieza metalica 43*10 ="+e.costoSolicitud("14"));
		System.out.println();
		System.out.println(e.costoTotalSolicitudes("mk69"));
		e.agregarSolicitudMixta("15", "mk69", "53", "lami", 3,	"MIXTA", date, 10, ensamble);
		System.out.println(e.buscarSolicitud("15").getCodCliente());
		System.out.println("costo pieza mixta 181*10 ="+e.costoSolicitud("15"));
		System.out.println(e.costoTotalSolicitudes("mk69"));
		
		System.out.println(e.buscarVip().getCodigo());
		
		
		
		
		
		/*e.buscarSolicitud("3").getPieza().addPieza("PLASTICO");
		System.out.println("costo pieza mixta 181 10 "+e.costoSolicitud("3"));*/
		
		
		
		
		
	}

}
