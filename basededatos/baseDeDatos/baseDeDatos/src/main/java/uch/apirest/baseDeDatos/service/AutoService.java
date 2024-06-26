package uch.apirest.baseDeDatos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uch.apirest.baseDeDatos.entity.Auto;
import uch.apirest.baseDeDatos.repository.AutoRepository;

import jakarta.annotation.PostConstruct;
import java.util.List;

@Service
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;

    @PostConstruct
    public void init() {
        autoRepository.save(new Auto("Toyota", "Corolla", 2020));
        autoRepository.save(new Auto("Honda", "Civic", 2019));
        autoRepository.save(new Auto("Ford", "Focus", 2018));
    }

    public List<Auto> getAutos() {
        return autoRepository.findAll();
    }
}
