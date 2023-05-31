package fin.coop1504.tallerjava;

import java.util.Date;
import java.util.GregorianCalendar;

import fin.coop1504.tallerjava.entidades.DocumentoSRI;
import fin.coop1504.tallerjava.entidades.Persona;
import fin.coop1504.tallerjava.servicios.ServiciosPersona;

public class AplicacionTaller {

	public static void main(String[] args) {
		
		//ServiciosPersona.registrarDatos("Ramiro", "123456789");
		
		DocumentoSRI ruc = new DocumentoSRI();
		ruc.setActividadEconomica("DESARROLLO DE SOFTWARE");
		ruc.setFechaExpedicion(new Date());	
		ruc.setEstado("A");
		
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		cal.add(GregorianCalendar.YEAR, 1);
		
		ruc.setFechaExpiracion(cal.getTime());
		
		/*Persona persona = new Persona("Ramiro", "123456789");
		
		ServiciosPersona.registrarDatosJuridicos(persona, ruc);*/ //este crea y consume memoria
		
		ServiciosPersona.registrarDatosJuridicos(new Persona("Ramiro","123456"), ruc);//crea al utilizarlo y luego desaparece
		
		
	}

}
