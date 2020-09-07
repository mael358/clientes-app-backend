package com.crm.springboot.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crm.springboot.backend.models.entity.Cliente;
import com.crm.springboot.backend.models.entity.Municipio;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

	@Query("from Municipio")
	public List<Municipio> findAllMunicipios();
}
