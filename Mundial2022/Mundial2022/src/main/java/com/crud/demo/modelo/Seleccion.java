package com.crud.demo.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Seleccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String grupo;
	@ManyToOne()
    @JoinColumn(name = "id")
    private Continente continente;

	@OneToMany(mappedBy = "seleccion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Resultado> resultado;
	


	public Seleccion() {
		// TODO Auto-generated constructor stub
	}
	public Seleccion(int id, String nombre, String grupo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.grupo = grupo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	
}
