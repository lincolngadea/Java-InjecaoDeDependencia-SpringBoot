package io.java.dependenceinjection.spring.service;

import io.java.dependenceinjection.spring.model.Cliente;
import io.java.dependenceinjection.spring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.clienteRepository.persistir(cliente);
    }
    public void validarCliente(Cliente cliente) {
    }
}
