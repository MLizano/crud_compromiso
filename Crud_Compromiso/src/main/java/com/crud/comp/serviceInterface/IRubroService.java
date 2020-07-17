package com.crud.comp.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.crud.comp.modelo.Rubro;

public interface IRubroService {
	public List<Rubro> listar();

	public Optional<Rubro> listarId(int id);

	public int save(Rubro p);

	public void delete(int id);
}
