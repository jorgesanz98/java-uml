package rugby;

import java.sql.Date;

public class persona 
{
	private String nombre;
	private String fechaNacimiento;
	public persona()
	{
	}
	public persona(String nombre, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String string) {
		this.fechaNacimiento = string;
	}
	public String mostrarDatos()
	{
		return "nombre:"+nombre+"fechanac:"+fechaNacimiento;
	}
	
}
