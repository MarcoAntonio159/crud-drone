package org.empresa.drones.model.service;

import org.empresa.drones.model.entity.Producto;
import org.empresa.drones.model.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl  implements IProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listarTodos() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public void guardar(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public Producto buscarPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
}
