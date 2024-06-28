package uch.apirest.baseDeDatos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uch.apirest.baseDeDatos.entity.Auto;
import uch.apirest.baseDeDatos.entity.Patente;
import uch.apirest.baseDeDatos.entity.Propietario2;
import uch.apirest.baseDeDatos.repository.AutoRepository;
import uch.apirest.baseDeDatos.repository.PatenteInterface;
import uch.apirest.baseDeDatos.repository.PropietarioRepository2;

import jakarta.annotation.PostConstruct;
import java.util.List;

@Service
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;

    @Autowired
    private PropietarioRepository2 propietarioRepository;

    @Autowired
    private PatenteInterface patenteRepository;

    @PostConstruct
    public void init() {
        Propietario2 p1 = new Propietario2("Luisina Gomez");
        Propietario2 p2 = new Propietario2("Violeta Gomez");
        Propietario2 p3 = new Propietario2( "Maria Gomez");
        propietarioRepository.save(p1);
        propietarioRepository.save(p2);
        propietarioRepository.save(p3);

        //autoRepository.save(new Auto("Toyota", "Corolla", 2020, p1));
        //autoRepository.save(new Auto("Honda", "Civic", 2019, p2));
        //autoRepository.save(new Auto("Ford", "Focus", 2018, p3));

        guardarAutoConPatente("Toyota", "Corolla", 2020, p1, "FNX-675", "Mendoza");
        guardarAutoConPatente("Honda", "Civic", 2019, p2, "ABC-123", "Buenos Aires");
        guardarAutoConPatente("Ford", "Focus", 2018, p3,"XYZ-789", "Córdoba");
    }


    public Auto guardarAutoConPatente(String marca, String modelo, int año, Propietario2 propietario, String numeroPatente, String provinciaPatente) {
        // Crear una instancia de Auto y asociar el propietario
        Auto auto = new Auto(marca, modelo, año, propietario);

        // Crear una instancia de Patente y asociarla al Auto
        Patente patente = new Patente(numeroPatente, provinciaPatente, auto);
        auto.setPatente(patente);

        // Guardar Auto y Patente
        autoRepository.save(auto);
        patenteRepository.save(patente);

        // Actualizar la relación bidireccional
        propietario.getAutos().add(auto);
        propietarioRepository.save(propietario);

        return auto;
    }

    public List<Auto> getAutos() {
        return autoRepository.findAll();
    }
}
