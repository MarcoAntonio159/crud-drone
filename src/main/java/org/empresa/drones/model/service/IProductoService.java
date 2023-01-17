package org.empresa.drones.model.service;

import org.empresa.drones.model.entity.Producto;

import java.util.List;

public interface IProductoService {

    public List<Producto> listarTodos();

    public void guardar(Producto producto);

    public Producto buscarPorId(Long id);

    public void eliminar(Long id);


}
