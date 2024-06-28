package uch.apirest.baseDeDatos.entity;

import jakarta.persistence.*;

@Entity
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private int año;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "propietario_id")
    private Propietario2 propietario2;

    @OneToOne(mappedBy = "auto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Patente patente;
    public Auto() {}

    public Auto(String marca, String modelo, int año, Propietario2 propietario2) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.propietario2 = propietario2;
    }

    public Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Propietario2 getPropietario2() {
        return propietario2;
    }

    public void setPropietario2(Propietario2 propietario2) {
        this.propietario2 = propietario2;
    }

    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
        if (patente != null) {
            patente.setAuto(this);
        }
    }
}
