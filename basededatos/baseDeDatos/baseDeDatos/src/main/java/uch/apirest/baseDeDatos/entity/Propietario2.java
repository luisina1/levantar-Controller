package uch.apirest.baseDeDatos.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Propietario2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "propietario2", cascade = CascadeType.ALL)
    private List<Auto> autos;

    public Propietario2() {}

    public Propietario2(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
