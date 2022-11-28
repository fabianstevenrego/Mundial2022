package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.demo.modelo.Partido;
import com.crud.demo.modeloDAO.IPartido;
import com.crud.demo.serviceInterface.IpartidoService;

public class PartidoService implements IpartidoService {
    @Autowired
	private IPartido dao;
	
	@Override
	public List<Partido> listar() {		
		return (List<Partido>) dao.findAll();
	}

	@Override
	public Optional<Partido> listarId(int id) {		
		return dao.findById(id);
	}

	@Override
	public int save(Partido p) {
		int res=0;
		Partido per=dao.save(p);
		if(!per.equals(null)) {
			res=1;
		}
		return res;
	}

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }

	
}
