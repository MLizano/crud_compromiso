package com.crud.comp.modeloDAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.comp.modelo.Rubro;

@Repository
public interface IRubro extends CrudRepository<Rubro, Integer>{

}
