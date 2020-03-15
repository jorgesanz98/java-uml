package rugby;

import java.sql.Date;

public class jugador extends persona
{
	private posiciones posicion;
	public jugador(persona p1) {
		super(p1.getNombre(), p1.getFechaNacimiento());
	}
	public posiciones getPosicion() {
		return posicion;
	}
	public void setPosicion(posiciones posicion) {
		this.posicion = posicion;
	}
	public String mostrarDatosJugador(persona p1)
	{
		return p1.mostrarDatos()+"posicion:"+posicion;
	}
}
