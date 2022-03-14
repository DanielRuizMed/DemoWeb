package com.nttdata.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.bootcamp.repository.entity.Usuario;

public interface UsuarioRepoJPA extends JpaRepository<Usuario, String>{

}
