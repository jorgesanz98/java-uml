package ejercicio1;

import java.sql.Date;

public class persona 
{
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private String nacionalidad;
	public pelicula participa;
	public pelicula dirige;
	public pelicula produce;
	public pelicula escribe;
	public java.util.Collection hechoPor = new java.util.TreeSet();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public pelicula getParticipa() {
		return participa;
	}
	public void setParticipa(pelicula participa) {
		this.participa = participa;
	}
	public pelicula getDirige() {
		return dirige;
	}
	public void setDirige(pelicula dirige) {
		this.dirige = dirige;
	}
	public pelicula getProduce() {
		return produce;
	}
	public void setProduce(pelicula produce) {
		this.produce = produce;
	}
	public pelicula getEscribe() {
		return escribe;
	}
	public void setEscribe(pelicula escribe) {
		this.escribe = escribe;
	}
	public java.util.Collection getHechoPor() {
		return hechoPor;
	}
	public void setHechoPor(java.util.Collection hechoPor) {
		this.hechoPor = hechoPor;
	}
}
