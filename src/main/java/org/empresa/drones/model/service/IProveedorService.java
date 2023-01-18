package org.empresa.drones.model.service;

import org.empresa.drones.model.entity.Proveedor;

import java.util.List;

public interface IProveedorService {

    public List<Proveedor> listarTodosProveedores();
    public void guardarProveedor(Proveedor proveedor);
    public Proveedor buscarProveedorPorId(Long id);
    public void eliminarProveedor(Long id);

}
