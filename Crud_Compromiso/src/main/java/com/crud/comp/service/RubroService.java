package com.crud.comp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.comp.modelo.Rubro;
import com.crud.comp.modeloDAO.IRubro;
import com.crud.comp.serviceInterface.IRubroService;

@Service
public class RubroService implements IRubroService {

	@Autowired
	private IRubro dao;
	
	@Override
	public List<Rubro> listar() {		
		return (List<Rubro>) dao.findAll();
	}

	@Override
	public Optional<Rubro> listarId(int id) {		
		return dao.findById(id);
	}

	@Override
	public int save(Rubro r) {
		int res=0;
		Rubro rub=dao.save(r);
		if(!rub.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
		
	}
	
}