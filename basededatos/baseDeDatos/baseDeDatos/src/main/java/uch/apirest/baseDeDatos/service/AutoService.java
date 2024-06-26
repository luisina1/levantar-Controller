package uch.apirest.baseDeDatos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uch.apirest.baseDeDatos.entity.Auto;
import uch.apirest.baseDeDatos.entity.Propietario2;
import uch.apirest.baseDeDatos.repository.AutoRepository;
import uch.apirest.baseDeDatos.repository.PropietarioRepository2;

import jakarta.annotation.PostConstruct;
import java.util.List;

@Service
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;

    @Autowired
    private PropietarioRepository2 propietarioRepository;

    @PostConstruct
    public void init() {
        Propietario2 p1 = new Propietario2("Luisina Gomez");
        Propietario2 p2 = new Propietario2("Violeta Gomez");
        Propietario2 p3 = new Propietario2( "Maria Gomez");
        propietarioRepository.save(p1);
        propietarioRepository.save(p2);
        propietarioRepository.save(p3);

        autoRepository.save(new Auto("Toyota", "Corolla", 2020, p1));
        autoRepository.save(new Auto("Honda", "Civic", 2019, p2));
        autoRepository.save(new Auto("Ford", "Focus", 2018, p3));
    }

    public List<Auto> getAutos() {
        return autoRepository.findAll();
    }
}
