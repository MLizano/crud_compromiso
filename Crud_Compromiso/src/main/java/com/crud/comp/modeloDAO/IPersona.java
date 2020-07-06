package com.crud.comp.modeloDAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.comp.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
