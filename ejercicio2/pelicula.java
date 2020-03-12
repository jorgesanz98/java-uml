package ejercicio2;

import java.time.Year;

public class pelicula
{
	private String titulo;
	private Year agno;
	private String sinopsis;
	private String pais;
	private genero genero;
	public java.util.Collection actor = new java.util.TreeSet();
	public java.util.Collection director = new java.util.TreeSet();
	public java.util.Collection productor = new java.util.TreeSet();
	public java.util.Collection guionista = new java.util.TreeSet();
	public trailer tieneTrailer;
	public pelicula()
	{
		tieneTrailer = new trailer();
	}
}
