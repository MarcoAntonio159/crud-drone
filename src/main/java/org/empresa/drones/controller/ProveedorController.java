package org.empresa.drones.controller;

import jakarta.validation.Valid;
import org.empresa.drones.model.entity.Proveedor;
import org.empresa.drones.model.service.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/vista/proveedor")
public class ProveedorController {

    @Autowired
    private IProveedorService proveedorService;

    @GetMapping("/")
    public String listarProveedores(Model model) {

        List<Proveedor> listadoProveedores = proveedorService.listarTodosProveedores();

        model.addAttribute("titulo", "Lista de Proveedores");
        model.addAttribute("proveedores", listadoProveedores);

        return "/vista/proveedor/listar";
    }

    @GetMapping("/crear")
    public String crear(Model model) {

        Proveedor proveedor = new Proveedor();

        model.addAttribute("titulo", "FORMULARIO: Nuevo Proveedor");
        model.addAttribute("proveedor", proveedor);

        return "/vista/proveedor/frmCrear";

    }

    @PostMapping("/save")
    public String guardar(@Valid @ModelAttribute Proveedor proveedor, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("titulo", "FORMULARIO: Nuevo Proveedor");
            model.addAttribute("proveedor", proveedor);
            System.out.println("Existieron errores en el formulario de proveedor");
            return "/vista/proveedor/frmCrear";
        }

        proveedorService.guardarProveedor(proveedor);
        System.out.println("Proveedor guardado con exito");
        return "redirect:/vista/proveedor/";

    }

    @GetMapping("/edit/{id}")
    public String editar(@PathVariable("id") Long idProveedor, Model model) {

        Proveedor proveedor = proveedorService.buscarProveedorPorId(idProveedor);

        model.addAttribute("titulo", "FORMULARIO: Editar Proveedor");
        model.addAttribute("proveedor", proveedor);

        return "/vista/proveedor/frmCrear";

    }

    @GetMapping("/delete/{id}")
    public String eliminar(@PathVariable("id") Long idProveedor) {

        proveedorService.eliminarProveedor(idProveedor);
        System.out.println("Proveedor eliminado con exito");

        return "redirect:/vista/proveedor/";

    }

}
