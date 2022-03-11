package com.nttdata.bootcamp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.repository.EmpleadoRepo;
import com.nttdata.bootcamp.repository.EmpleadoRepoJPA;
import com.nttdata.bootcamp.repository.entity.Empleado;
import com.nttdata.bootcamp.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	EmpleadoRepoJPA repoJPA;
	
	@Override
	public void registrar(String nombre) {
		repoJPA.registrar(nombre);
		
	}

	@Override
	public List<Empleado> listar() {
		return repoJPA.findAll();
	}

	@Override
	public List<Empleado> listarFiltroNombre(String texto_nombre){
		return repoJPA.listarCuyoNombreContiene(texto_nombre);
	}

	@Override
	public List<Empleado> listarConJPA(Integer pID, String contiene) {
		
		return repoJPA.findByIdGreaterThanAndNombreLike(pID, contiene);
	}

	@Override
	public List<Empleado> listarFriltroNombreEs(String nombre) {
		return repoJPA.listarCuyoNombreEs(nombre);
	}

	@Override
	public Empleado insertar(Empleado emp) {
		return repoJPA.save(emp);
	}

	
}
