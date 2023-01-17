package org.empresa.drones.model.repository;

import org.empresa.drones.model.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
}
