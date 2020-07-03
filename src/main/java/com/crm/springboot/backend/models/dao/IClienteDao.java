package com.crm.springboot.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.springboot.backend.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
