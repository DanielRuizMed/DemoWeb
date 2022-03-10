package com.nttdata.bootcamp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.repository.EmpleadoRepo;
import com.nttdata.bootcamp.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	EmpleadoRepo empleadoRepo;
	
	@Override
	public void registrar(String nombre) {
		empleadoRepo.registrar(nombre);
		
	}

	
}
