package Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException, ESolicitud {

		Empresa e = new Empresa("EIA" , "Envigado" );
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = format.format(new Date());
		Date date = format.parse ( "2019-02-18" );    
		e.agregarSolicitud("c0d1g0", "123", date, 4);
		System.out.println("test " + e.buscarSolicitud("c0d1g0").getCodigo() );
	}

}
