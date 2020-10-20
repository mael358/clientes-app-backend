package com.crm.springboot.backend.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "no puede estar vacío")
	@Size(min = 4, max = 12, message = "el tamaño debe ser entre 4 y 12")
	@Column(nullable = false)
	private String nombre;

	@NotEmpty(message = "no puede estar vacío")
	private String apellido;

	@NotEmpty(message = "no puede estar vacío")
	@Email(message = "Debe ser una direccion de corre valida")
	@Column(nullable = false, unique = false)
	private String email;

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	@NotNull(message = "no puede estar vacio")
	private Date createAt;

	@NotNull(message="el municipio no puede estar vacio")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="municipio_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Municipio municipio;

	private String foto;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"cliente","hibernateLazyInitializer","handler"})
	private List<Factura> facturas;

	public Cliente() {
		this.facturas = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	private static final long serialVersionUID = 1L;
}
