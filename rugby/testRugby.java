package rugby;

import java.util.Collection;

public class testRugby {

	public static void main(String[] args) 
	{
		persona persona1 = new persona();
		persona1.setNombre("jorge");
		persona1.setFechaNacimiento("10-02-1980");
		jugador jugador1 = new jugador(persona1);
		posiciones pos1 = posiciones.ala;
		jugador1.setPosicion(pos1);
		System.out.println(jugador1.mostrarDatosJugador(persona1));
		persona persona2 = new persona();
		persona2.setNombre("juan");
		posiciones pos2 = posiciones.apertura;
		persona2.setFechaNacimiento("23-03-1998");
		jugador jugador2 = new jugador(persona2);
		jugador2.setPosicion(pos2);
		System.out.println(jugador2.mostrarDatosJugador(persona2));
		equipo equipo1 = new equipo();
		paises pais1 = paises.Escocia;
		equipo1.setEquipo(pais1);
		arbitro arbitro1 = new arbitro();
		arbitro1.setNombre("alfredo");
		partido partido1 = new partido();
		partido1.setArbitro(arbitro1);
		partido1.setLocal(equipo1);
		equipo equipo2 = new equipo();
		paises pais2 = paises.Francia;
		equipo2.setEquipo(pais2);
		partido1.setVisitante(equipo2);
		System.out.println(partido1.mostrarDatosPartido());
	}

}
