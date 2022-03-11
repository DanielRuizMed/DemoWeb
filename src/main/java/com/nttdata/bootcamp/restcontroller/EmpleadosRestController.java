package com.nttdata.bootcamp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@Cacheable(value="empleados")
	public List<Empleado> listarEmpleados(){
		try {
			Thread.sleep(1500);
		}catch(InterruptedException e) {}
		return empleadoService.listar();
	}
	
	@PostMapping
	@CacheEvict(value="empleados", allEntries=true)
	public void insertarEmpleado(@RequestBody Empleado emp) {
		empleadoService.insertar(emp);
	}
	
}
