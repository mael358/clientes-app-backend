package com.crm.springboot.backend.models.dao;

import com.crm.springboot.backend.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
