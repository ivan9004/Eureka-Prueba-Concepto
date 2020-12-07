package com.app.oauth.service.services;

import com.app.service.usuarios.commons.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
