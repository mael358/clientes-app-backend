package com.crm.springboot.backend.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "facturas_item")
public class ItemFactura  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;

    public Double calcularTotal(){
        return cantidad.doubleValue();
    }

    private static final long serialVersionUID = 1L;
}
