package com.crm.springboot.backend.models.services;

import java.util.List;

import com.crm.springboot.backend.models.entity.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.crm.springboot.backend.models.entity.Cliente;
import com.crm.springboot.backend.models.entity.Municipio;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Municipio> findAllMunicipios();

	public Factura findFacturaById(Long id);

	public Factura save(Factura factura);

	public void deleteFacturaById(Long id);
}
