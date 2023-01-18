package org.empresa.drones.model.repository;

import org.empresa.drones.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
