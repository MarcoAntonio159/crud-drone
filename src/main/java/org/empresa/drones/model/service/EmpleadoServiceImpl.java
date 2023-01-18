package org.empresa.drones.model.service;

import org.empresa.drones.model.entity.Empleado;
import org.empresa.drones.model.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

    @Autowired
    public EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listarEmpleados() {
        return (List<Empleado>) empleadoRepository.findAll();
    }
}
