package ejercicio1;

import java.sql.Time;
import java.util.Collection;

import ejercicio2.actor;

public class testPelicula {

	public static void main(String[] args) 
	{
		pelicula peli1 = new pelicula();
		peli1.setTitulo("Mision imposible");
		peli1.setAgno(2011);
		peli1.setPais("España");
		peli1.mostrarDatos();
		persona actor1 = new persona();
		actor1.setNombre("Tom Cruise");
		actor1.setParticipa(peli1);
		peli1.setGenero(genero.drama);
		trailer trailer1 = new trailer();
		Time tiempo = Time.valueOf("18:45:20");
		trailer1.setDuracion(tiempo);
		peli1.setTieneTrailer(trailer1);
		System.out.println("---------------------");
		trailer1.mostrarDatosTrailer();
		
	}

}
