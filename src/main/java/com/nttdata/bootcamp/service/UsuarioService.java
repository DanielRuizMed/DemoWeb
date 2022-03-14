package com.nttdata.bootcamp.service;

import java.util.List;

import com.nttdata.bootcamp.repository.entity.Usuario;

public interface UsuarioService {

	List<Usuario> listar();
	Usuario buscarPorUsername(String username);
}
