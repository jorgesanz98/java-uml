package ejercicio1;

import java.time.Year;

public class pelicula
{
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAgno() {
		return agno;
	}
	public void setAgno(int i) {
		this.agno = i;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public genero getGenero() {
		return genero;
	}
	public void setGenero(genero genero) {
		this.genero = genero;
	}
	public java.util.Collection getActor() {
		return actor;
	}
	public void setActor(java.util.Collection actor) {
		this.actor = actor;
	}
	public java.util.Collection getDirector() {
		return director;
	}
	public void setDirector(java.util.Collection director) {
		this.director = director;
	}
	public java.util.Collection getProductor() {
		return productor;
	}
	public void setProductor(java.util.Collection productor) {
		this.productor = productor;
	}
	public java.util.Collection getGuionista() {
		return guionista;
	}
	public void setGuionista(java.util.Collection guionista) {
		this.guionista = guionista;
	}
	public trailer getTieneTrailer() {
		return tieneTrailer;
	}
	public void setTieneTrailer(trailer tieneTrailer) {
		this.tieneTrailer = tieneTrailer;
	}
	public String titulo;
	public int agno;
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
	public void mostrarDatos()
	{
		System.out.println("Titulo: "+titulo+"\n"+"Agno: "+agno+"\n"+"Pais: "+pais+"\n"+"Actor: "
	+actor+"\n"+"Genero: "+genero+"Trailer"+tieneTrailer);
	}
}
