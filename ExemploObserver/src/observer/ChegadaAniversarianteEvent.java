package observer;

import java.util.Date;

public class ChegadaAniversarianteEvent {
	// carrega dados do evento
	private final Date horaDaChegada;

	public ChegadaAniversarianteEvent(Date horaDaChegada) {
		super();
		this.horaDaChegada = horaDaChegada;
	}

	public Date getHoraDaChegada() {
		return horaDaChegada;
	}
	
	
}
