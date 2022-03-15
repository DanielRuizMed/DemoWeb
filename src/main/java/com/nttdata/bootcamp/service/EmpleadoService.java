package com.nttdata.bootcamp.service;

import java.util.List;

import com.nttdata.bootcamp.repository.entity.Empleado;

public interface EmpleadoService {

	public void registrar(String nombre);
	public List<Empleado> listar();
	public List<Empleado> listarFiltroNombre(String texto_nombre);
	public List<Empleado> listarConJPA(Integer pID, String contiene);
	public List<Empleado> listarFriltroNombreEs(String nombre);
	Empleado insertar(Empleado emp);
	public Empleado modificar(Empleado emp);
	public void eliminar(Integer id);
	public Empleado getById(Integer id);
}
