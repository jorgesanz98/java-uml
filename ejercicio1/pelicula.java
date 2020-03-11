package ejercicio1;

public class pelicula
{
	private String titulo;
	private String agno;
	private String sinopsis;
	private String pais;
	private String genero;
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
