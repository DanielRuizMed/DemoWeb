package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nttdata.bootcamp.service.EmpleadoService;

@Controller
public class WebController {
	
	@Autowired
	EmpleadoService empleadoService;

	@GetMapping("/saludo")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Mundo") 
							String nombre, Model model) {
		model.addAttribute("name", nombre);
		empleadoService.registrar(nombre);
		return "hola";
	}
	
	@GetMapping("/error")
	public String error_page(){
		return "error";
	}
	
	@GetMapping("/listarEmpleados")
	public String listarEmp(Model model){
		model.addAttribute("listaEmp", empleadoService.listar());
		model.addAttribute("listaEmpConE", empleadoService.listarFiltroNombre("e"));
		model.addAttribute("listaJPA", empleadoService.listarConJPA(2, "%o%"));
		model.addAttribute("listaEmpNombreExacto", empleadoService.listarFriltroNombreEs("Rocío"));
		return "listarDeEmpleados";
	}
	
	
}

