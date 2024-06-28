package uch.apirest.baseDeDatos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uch.apirest.baseDeDatos.entity.Patente;
import uch.apirest.baseDeDatos.repository.PatenteInterface;

@Service
public class PatenteService {

    private final PatenteInterface patenteRepository;

    @Autowired
    public PatenteService(PatenteInterface patenteRepository) {
        this.patenteRepository = patenteRepository;
    }

    public Patente guardarPatente(Patente patente) {
        return patenteRepository.save(patente);
    }

    public Patente buscarPorId(Long id) {
        return patenteRepository.findById(id).orElse(null);
    }

}
