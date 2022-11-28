package com.crud.demo.modeloDAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Seleccion;

@Repository
public interface ISeleccion extends CrudRepository<Seleccion, Integer>{

}
