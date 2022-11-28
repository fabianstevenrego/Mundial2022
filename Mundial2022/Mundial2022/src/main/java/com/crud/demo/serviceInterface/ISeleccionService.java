package com.crud.demo.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.crud.demo.modelo.Seleccion;

public interface ISeleccionService {
	public List<Seleccion> listar();

	public Optional<Seleccion> listarId(int id);

	public int save(Seleccion p);

	public void delete(int id);
}
