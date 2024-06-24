package com.uch.apirest.apirest.service;

import com.uch.apirest.apirest.model.Auto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoService {

    private List<Auto> autos = new ArrayList<>();

    public AutoService() {
        autos.add(new Auto("Toyota", "Corolla", 2020));
        autos.add(new Auto("Honda", "Civic", 2019));
        autos.add(new Auto("Ford", "Focus", 2018));
    }

    public List<Auto> getAutos() {
        return autos;
    }
}
