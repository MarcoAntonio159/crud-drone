package org.empresa.drones.model.service;

import org.empresa.drones.model.entity.Cliente;
import org.empresa.drones.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    public ClienteRepository clienteDao;
    @Override
    public List<Cliente> listarClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }
}
