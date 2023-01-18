package org.empresa.drones.model.repository;

import org.empresa.drones.model.entity.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {
}
