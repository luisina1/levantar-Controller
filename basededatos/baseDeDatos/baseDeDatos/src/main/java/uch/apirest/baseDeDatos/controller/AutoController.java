package uch.apirest.baseDeDatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uch.apirest.baseDeDatos.entity.Auto;
import uch.apirest.baseDeDatos.service.AutoService;

import java.util.List;

@RestController
public class AutoController {

    @Autowired
    private AutoService autoService;

    @GetMapping("/names")
    public String holaMundo() {
        return "Hola Mundo en API REST";
    }

    @GetMapping("/autos")
    public List<Auto> getAutoController() {
        List<Auto> autoList = autoService.getAutos();
        autoList.forEach(auto -> {
            auto.setMarca("test");
            auto.setAño(auto.getAño() + 7);
        });
        return autoList;
    }
}
