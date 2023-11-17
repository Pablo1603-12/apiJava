package com.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "\"Accesos\"", schema = "\"gbp_operacional\"")
public class Accesos {

    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_acceso", nullable = false)
    private long id_acceso;

    @Column(name = "codigo_acceso", nullable = false)
    private String codigo_acceso;

    @Column(name = "descripcion_acceso")
    private String descripcion_acceso;

    @OneToMany(mappedBy = "acceso")
    List<Usuario> usuariosConAcceso;

    //CONSTRUCTORES
    public Accesos() {

    }

    @Override
    public String toString() {
        return "Accesos{" +
                "id_acceso=" + id_acceso +
                ", codigo_acceso='" + codigo_acceso + '\'' +
                ", descripcion_acceso='" + descripcion_acceso + '\'' +
                ", usuariosConAcceso=" + usuariosConAcceso +
                '}';
    }

    public Accesos(String codigo_acceso, String descripcion_acceso) {

        this.codigo_acceso = codigo_acceso;
        this.descripcion_acceso = descripcion_acceso;
    }

    public long getId_acceso() {
        return id_acceso;
    }

    public void setId_acceso(long id_acceso) {
        this.id_acceso = id_acceso;
    }

    public String getCodigo_acceso() {
        return codigo_acceso;
    }

    public void setCodigo_acceso(String codigo_acceso) {
        this.codigo_acceso = codigo_acceso;
    }

    public String getDescripcion_acceso() {
        return descripcion_acceso;
    }

    public void setDescripcion_acceso(String descripcion_acceso) {
        this.descripcion_acceso = descripcion_acceso;
    }

    public List<Usuario> getUsuariosConAcceso() {
        return usuariosConAcceso;
    }

    public void setUsuariosConAcceso(List<Usuario> usuariosConAcceso) {
        this.usuariosConAcceso = usuariosConAcceso;
    }



}
