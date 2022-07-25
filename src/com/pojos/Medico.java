package com.pojos;
// Generated Jul 25, 2022 12:39:37 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Medico generated by hbm2java
 */
@Entity
@Table(name = "medico",
         schema = "public"
)
public class Medico implements java.io.Serializable {

    private int id;
    private String codigoInterno;
    private String nombres;
    private String apellidos;
    private String ci;
    private String celular;
    private String direccion;
    private Set<CirugiaMedico> cirugiaMedicos = new HashSet<CirugiaMedico>(0);

    public Medico() {
    }

    public Medico(String codigoInterno, String nombres, String apellidos, String ci, String celular, String direccion) {
        this.codigoInterno = codigoInterno;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ci = ci;
        this.celular = celular;
        this.direccion = direccion;
    }

    public Medico(int id, String codigoInterno, String nombres, String apellidos, String ci, String celular, String direccion, Set<CirugiaMedico> cirugiaMedicos) {
        this.id = id;
        this.codigoInterno = codigoInterno;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ci = ci;
        this.celular = celular;
        this.direccion = direccion;
        this.cirugiaMedicos = cirugiaMedicos;
    }

    @Id

    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "codigo_interno", nullable = false, length = 10)
    public String getCodigoInterno() {
        return this.codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    @Column(name = "nombres", nullable = false, length = 20)
    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Column(name = "apellidos", nullable = false, length = 20)
    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Column(name = "ci", nullable = false, length = 12)
    public String getCi() {
        return this.ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Column(name = "celular", nullable = false, length = 12)
    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Column(name = "direccion", nullable = false, length = 200)
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "medico")
    public Set<CirugiaMedico> getCirugiaMedicos() {
        return this.cirugiaMedicos;
    }

    public void setCirugiaMedicos(Set<CirugiaMedico> cirugiaMedicos) {
        this.cirugiaMedicos = cirugiaMedicos;
    }

}
