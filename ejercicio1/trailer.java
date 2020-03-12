package ejercicio1;

import java.net.URL;
import java.sql.Time;

public class trailer 
{
	private URL url;
	private Time duracion;
	public java.util.Collection TrailerPersona = new java.util.TreeSet();
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	public Time getDuracion() {
		return duracion;
	}
	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}
	public java.util.Collection getTrailerPersona() {
		return TrailerPersona;
	}
	public void setTrailerPersona(java.util.Collection trailerPersona) {
		TrailerPersona = trailerPersona;
	}
	public void mostrarDatosTrailer()
	{
		System.out.println("Duracion: "+duracion);
	}
	
}
