package com.crm.springboot.backend.controllers;

import com.crm.springboot.backend.models.entity.Cliente;
import com.crm.springboot.backend.models.entity.Municipio;
import com.crm.springboot.backend.models.services.ClienteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class ClienteRestControllerTest {

    ClienteRestController clienteController;

    ClienteService clienteService;

    @BeforeEach
    void setUp() {
        clienteService = Mockito.mock(ClienteService.class);
        Mockito.when(clienteService.findAll()).thenReturn(
                Arrays.asList(
                        new Cliente(1L, "Marcos", "Velasquez", "marcosv200007@gmail.com", new Municipio(
                                1L, "0101", "Guatemala"
                        )),
                        new Cliente(2L, "Yoshio", "Raven", "dolor.Nulla.semper@dolordolor.edu", new Municipio(
                                1L, "0101", "Guatemala"
                        )),
                        new Cliente(3L, "Cooper", "Hayfa", "eu.nibh@Duisvolutpat.org", new Municipio(
                                1L, "0101", "Guatemala"
                        )),
                        new Cliente(4L, "Marcos", "Velasquez", "marcosv200007@gmail.com", new Municipio(
                                1L, "0101", "Guatemala"
                        )),
                        new Cliente(5L, "Marcos", "Velasquez", "marcosv200007@gmail.com", new Municipio(
                                1L, "0101", "Guatemala"
                        )),
                        new Cliente(6L, "Marcos", "Velasquez", "marcosv200007@gmail.com", new Municipio(
                                1L, "0101", "Guatemala"
                        )),
                        new Cliente(7L, "Marcos", "Velasquez", "marcosv200007@gmail.com", new Municipio(
                                1L, "0101", "Guatemala"
                        )),
                        new Cliente(8L, "Marcos", "Velasquez", "marcosv200007@gmail.com", new Municipio(
                                1L, "0101", "Guatemala"
                        )),
                        new Cliente(9L, "Marcos", "Velasquez", "marcosv200007@gmail.com", new Municipio(
                                1L, "0101", "Guatemala"
                        )),
                        new Cliente(10L, "Marcos", "Velasquez", "marcosv200007@gmail.com", new Municipio(
                                1L, "0101", "Guatemala"
                        )),
                        new Cliente(11L, "Marcos", "Velasquez", "marcosv200007@gmail.com", new Municipio(
                                1L, "0101", "Guatemala"
                        ))
                )
        );

        Mockito.when(clienteService.findById(1L)).thenReturn(
                new Cliente(1L, "Marcos", "Velasquez", "marcosv200007@gmail.com", new Municipio(
                        1L, "0101", "Guatemala"
                ))
        );

        Mockito.when(clienteService.findById(15L)).thenThrow(new DataAccessException("Error de datos") {
            @Override
            public String getMessage() {
                return super.getMessage();
            }
        });

        Mockito.when(clienteService.findById(14L)).thenReturn(null);

        clienteController = new ClienteRestController(clienteService);

    }

    @Test
    @DisplayName("Cuando busco todos los clientes")
    void finAllClientes() {
        Collection<Cliente> clientes = clienteController.index();
        assertThat(getClientesIds(clientes), is(Arrays.asList(1L, 2L, 3L,4L,5L,6L,7L,8L,9L,10L,11L)));
    }

    @Test
    @DisplayName("Cuando llamo un metodo null")
    void callNullObjectMethod() {
        Collection<Cliente> clientes = null;
        assertThrows(IllegalArgumentException.class ,() -> getClientesIds(clientes));
    }

    @Test
    @DisplayName("Buscando cliente por ID")
    void findClientById() {
        ResponseEntity responseEntity = clienteController.show(1L);
        int status = responseEntity.getStatusCodeValue();
        Cliente cliente = (Cliente) responseEntity.getBody();
        assertThat(status, is(200));
        assertThat(cliente.getId(), is(1L));
    }

    @Test
    @DisplayName("Manejo de DataAccessException cuando hay un error en la base de datos")
    void dataAccessException() {
        ResponseEntity responseEntity = clienteController.show(15L);
        int status = responseEntity.getStatusCodeValue();
        Map<String, Object> body = (Map<String, Object>) responseEntity.getBody();
        assertThat(status, is(500));
        assertThat(body.get("mensaje"), is("Error al realizar la consulta a la base de datos"));
    }

    @Test
    @DisplayName("404 cuando el cliente no fue encontrado")
    void code404WhenClientNotfound() {
        ResponseEntity responseEntity = clienteController.show(14L);
        int status = responseEntity.getStatusCodeValue();
        Map<String, Object> body = (Map<String, Object>) responseEntity.getBody();
        assertThat(status, is(404));
        //assertThat(body.get("mensaje"), is("Error al realizar la consulta a la base de datos"));
    }

    private List<Long> getClientesIds(Collection<Cliente> clientes){
        if (clientes == null) throw new IllegalArgumentException("La lista no puede ser nula");
        return clientes.stream().map(Cliente::getId).collect(Collectors.toList());
    }
}