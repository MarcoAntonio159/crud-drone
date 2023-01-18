package org.empresa.drones.model.service;

import org.empresa.drones.model.entity.Proveedor;
import org.empresa.drones.model.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements IProveedorService{

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public List<Proveedor> listarTodosProveedores() {
        return (List<Proveedor>) proveedorRepository.findAll();
    }

    @Override
    public void guardarProveedor(Proveedor proveedor) {
        proveedorRepository.save(proveedor);
    }

    @Override
    public Proveedor buscarProveedorPorId(Long id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarProveedor(Long id) {
        proveedorRepository.deleteById(id);
    }
}
