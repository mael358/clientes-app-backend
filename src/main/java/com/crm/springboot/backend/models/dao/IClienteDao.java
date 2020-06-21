package com.crm.springboot.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.crm.springboot.backend.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
