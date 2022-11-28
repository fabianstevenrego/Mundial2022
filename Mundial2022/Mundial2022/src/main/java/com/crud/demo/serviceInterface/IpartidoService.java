package com.crud.demo.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.crud.demo.modelo.Partido;

public interface IpartidoService {
    public List<Partido> listar();

	public Optional<Partido> listarId(int id);

	public int save(Partido p);

	public void delete(int id);
}
