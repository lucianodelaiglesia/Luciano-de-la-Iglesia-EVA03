package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	public Club(String nombre) {
		this.nombre = nombre;
		socios = new HashSet<>();
		competencias = new TreeMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void agregarDeportista(Deportista deportista) {
		socios.add(deportista);
	}

	public void crearEvento(TipoDeEvento tipo, String evento) {
		competencias.put(evento, new Evento(tipo));
	}

	public Integer inscribirEnEvento(String nombreEvento, Deportista deportista) throws NoEstaPreparado {
		Integer inscriptos = 0;
		Evento evento = competencias.get(nombreEvento);
		switch (competencias.get(nombreEvento).getTipo()) {
		case CARRERA_5K:
			if (deportista instanceof Corredor) {
				inscriptos = evento.agregarParticipante(deportista);
				break;
			}
		case CARRERA_10K:
			if (deportista instanceof Corredor) {
				inscriptos = evento.agregarParticipante(deportista);
				break;
			}
		case CARRERA_21K:
			if (deportista instanceof Corredor) {
				inscriptos = evento.agregarParticipante(deportista);
				break;
			}
		case CARRERA_42K:
			if (deportista instanceof Corredor) {
				inscriptos = evento.agregarParticipante(deportista);
				break;
			}
		case DUATLON:
			if (deportista instanceof Ciclista) {
				inscriptos = evento.agregarParticipante(deportista);
				break;
			}
		case CARRERA_NATACION_EN_PICINA:
			if (deportista instanceof Nadador) {
				inscriptos = evento.agregarParticipante(deportista);
				break;
			}
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if (deportista instanceof Nadador) {
				inscriptos = evento.agregarParticipante(deportista);
				break;
			}
		case TRIATLON_SHORT:
			if (deportista instanceof Triatleta) {
				inscriptos = evento.agregarParticipante(deportista);
				break;
			}
		case TRIATLON_OLIMPICO:
			if (deportista instanceof Triatleta) {
				inscriptos = evento.agregarParticipante(deportista);
				break;
			}
		case TRIATLON_MEDIO:
			if (deportista instanceof Triatleta) {
				inscriptos = evento.agregarParticipante(deportista);
				break;
			}
		case TRIATLON_IRONMAN:
			if (deportista instanceof Triatleta) {
				inscriptos = evento.agregarParticipante(deportista);
				break;
			}
		default:
			throw new NoEstaPreparado();
		} return inscriptos;
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

}
