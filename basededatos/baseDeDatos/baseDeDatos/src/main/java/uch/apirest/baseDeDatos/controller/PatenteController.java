package uch.apirest.baseDeDatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uch.apirest.baseDeDatos.entity.Patente;
import uch.apirest.baseDeDatos.service.PatenteService;

@RestController
@RequestMapping("/patentes")
public class PatenteController {

    private final PatenteService patenteService;

    @Autowired
    public PatenteController(PatenteService patenteService) {
        this.patenteService = patenteService;
    }

    @PostMapping("/guardar")
    public Patente guardarPatente(@RequestBody Patente patente) {
        return patenteService.guardarPatente(patente);
    }

    @GetMapping("/{id}")
    public Patente buscarPatentePorId(@PathVariable Long id) {
        return patenteService.buscarPorId(id);
    }

}
