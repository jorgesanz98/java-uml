package rugby;

import java.util.ArrayList;
import java.util.Collection;

public class partido 
{
	private int puntosLocal;
	private int puntosVisitante;
	private int bonusLocal;
	private int bonusVisitante;
	
	private Collection arbitro = new ArrayList<arbitro>();
	private Collection local = new ArrayList<equipo>();
	private Collection visitante = new ArrayList<equipo>();
	private Collection estadio = new ArrayList<estadio>();
	
	
	public partido() {
		super();
		this.puntosLocal = puntosLocal;
		this.puntosVisitante = puntosVisitante;
		this.bonusLocal = bonusLocal;
		this.bonusVisitante = bonusVisitante;
		this.arbitro = arbitro;
		this.local = local;
		this.visitante = visitante;
		this.estadio = estadio;
	}
	

	public int getPuntosLocal() {
		return puntosLocal;
	}


	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}


	public int getPuntosVisitante() {
		return puntosVisitante;
	}


	public void setPuntosVisitante(int puntosVisitante) {
		this.puntosVisitante = puntosVisitante;
	}


	public int getBonusLocal() {
		return bonusLocal;
	}


	public void setBonusLocal(int bonusLocal) {
		this.bonusLocal = bonusLocal;
	}


	public int getBonusVisitante() {
		return bonusVisitante;
	}


	public void setBonusVisitante(int bonusVisitante) {
		this.bonusVisitante = bonusVisitante;
	}


	public Collection getArbitro() {
		return arbitro;
	}


	public void setArbitro(arbitro arbitro1) {
		this.arbitro = arbitro1;
	}


	public Collection getLocal() {
		return local;
	}


	public void setLocal(equipo equipo1) {
		this.local =equipo1;
	}


	public Collection getVisitante() {
		return visitante;
	}


	public void setVisitante(Collection visitante) {
		this.visitante = visitante;
	}


	public Collection getEstadio() {
		return estadio;
	}


	public void setEstadio(Collection estadio) {
		this.estadio = estadio;
	}

	public String mostrarDatosPartido()
	{
		return arbitro+""+local;
	}
	public void resultado()
	{
		
	}
}
