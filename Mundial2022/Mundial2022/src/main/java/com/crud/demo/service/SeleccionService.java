package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.modelo.Seleccion;
import com.crud.demo.modeloDAO.ISeleccion;
import com.crud.demo.serviceInterface.ISeleccionService;

@Service
public class SeleccionService implements ISeleccionService {

	@Autowired
	private ISeleccion dao;
	
	@Override
	public List<Seleccion> listar() {		
		return (List<Seleccion>) dao.findAll();
	}

	@Override
	public Optional<Seleccion> listarId(int id) {		
		return dao.findById(id);
	}

	@Override
	public int save(Seleccion p) {
		int res=0;
		Seleccion per=dao.save(p);
		if(!per.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
		
	}

}
