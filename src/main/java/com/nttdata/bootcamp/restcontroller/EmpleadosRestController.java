package com.nttdata.bootcamp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.repository.entity.Empleado;
import com.nttdata.bootcamp.service.EmpleadoService;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadosRestController {
	
	@Autowired
	EmpleadoService empleadoService;
	
	@GetMapping
	public List<Empleado> listarEmpleados(){
		return empleadoService.listar();
	}
}
