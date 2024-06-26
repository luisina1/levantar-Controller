package uch.apirest.baseDeDatos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uch.apirest.baseDeDatos.entity.Propietario2;
import uch.apirest.baseDeDatos.repository.PropietarioRepository2;
import java.util.List;
import java.util.Optional;

@Service
public class PropietarioService {

    @Autowired
    private PropietarioRepository2 propietarioRepository;

    public List<Propietario2> getAllPropietarios() {
        return propietarioRepository.findAll();
    }

    public Optional<Propietario2> getPropietarioById(Long id) {
        return propietarioRepository.findById(id);
    }

    public Propietario2 savePropietario(Propietario2 propietario) {
        return propietarioRepository.save(propietario);
    }

}
