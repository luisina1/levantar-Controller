package uch.apirest.baseDeDatos.entity;

import jakarta.persistence.*;

@Entity
public class Patente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private String provincia;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "auto_id", unique = true)
    private Auto auto;

    public Patente() {}

    public Patente(String numero, String provincia, Auto auto) {
        this.numero = numero;
        this.provincia = provincia;
        this.auto = auto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
}
