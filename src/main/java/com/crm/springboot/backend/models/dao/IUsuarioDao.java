package com.crm.springboot.backend.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.crm.springboot.backend.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);

	/**
	 * Este metodo es lo mismo que findByUsername pero esta escrita con una consulta manual
	 * */
	@Query("SELECT u FROM Usuario u WHERE u.username = ?1")
	public Usuario BuscarUsuario(String username);
}
