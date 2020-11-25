package ar.edu.unlam.pb2.eva03;

import java.util.Map;
import java.util.TreeMap;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private String nombre;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;

	public Evento(TipoDeEvento tipo) {
		this.tipo = tipo;
		this.numeroDeInscripcion = 0;
		participantes = new TreeMap<>();
	}

	public Integer agregarParticipante(Deportista deportista) {
		participantes.put(this.numeroDeInscripcion++, deportista);
		return participantes.size();
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}

	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}

	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}

}
