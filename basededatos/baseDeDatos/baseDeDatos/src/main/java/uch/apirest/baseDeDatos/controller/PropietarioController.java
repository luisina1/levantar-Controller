package uch.apirest.baseDeDatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uch.apirest.baseDeDatos.entity.Propietario2;
import uch.apirest.baseDeDatos.service.PropietarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/propietarios")
public class PropietarioController {

    @Autowired
    private PropietarioService propietarioService;

    @GetMapping
    public List<Propietario2> getAllPropietarios() {
        return propietarioService.getAllPropietarios();
    }

    @GetMapping("/{id}")
    public Optional<Propietario2> getPropietarioById(@PathVariable Long id) {
        return propietarioService.getPropietarioById(id);
    }

    @PostMapping
    public Propietario2 createPropietario(@RequestBody Propietario2 propietario) {
        return propietarioService.savePropietario(propietario);
    }

}
