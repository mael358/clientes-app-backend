package com.crm.springboot.backend.models.services;

import com.crm.springboot.backend.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUserName(String username);
}
