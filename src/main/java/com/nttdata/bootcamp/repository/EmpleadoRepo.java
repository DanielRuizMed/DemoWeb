package com.nttdata.bootcamp.repository;

import java.util.List;

import com.nttdata.bootcamp.repository.entity.Empleado;

public interface EmpleadoRepo {
	
	public void registrar(String nombre);
	public List<Empleado> listarCuyoNombreContiene(String texto_nombre);
}
