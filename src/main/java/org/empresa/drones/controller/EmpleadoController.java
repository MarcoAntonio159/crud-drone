package org.empresa.drones.controller;

import org.empresa.drones.model.entity.Empleado;
import org.empresa.drones.model.service.EmpleadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vista/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoServiceImpl empleadoService;

    @GetMapping("/api")
    public List<Empleado> getEmpleados() {
        return empleadoService.listarEmpleados();
    }
}
