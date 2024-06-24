package com.uch.apirest.apirest.controller;

import com.uch.apirest.apirest.model.Auto;
import com.uch.apirest.apirest.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
