package com.sesi.atividadeava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesi.atividadeava.model.Usuario;
import com.sesi.atividadeava.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listarUsuario() {
		return usuarioRepository.findAll();
	}
	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
