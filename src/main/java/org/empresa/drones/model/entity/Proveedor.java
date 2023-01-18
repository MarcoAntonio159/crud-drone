package org.empresa.drones.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "ruc", nullable = false, length = 11)
    private String ruc;
    @NotEmpty
    @Column(name = "razonSocial", nullable = false, length = 100)
    private String razonSocial;
    @NotEmpty
    @Column(name = "direccionFiscal", nullable = false, length = 100)
    private String direccionFiscal;
    @NotEmpty
    @Column(name = "distrito", nullable = false, length = 100)
    private String distrito;
    @NotNull
    @Column(name = "telefono", nullable = false)
    private Integer telefono;
    @Email
    @Column(name = "correo", nullable = false, length = 50)
    private String correo;
    @NotEmpty
    @Column(name = "paginaWeb", nullable = false, length = 100)
    private String paginaWeb;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccionFiscal() {
        return direccionFiscal;
    }

    public void setDireccionFiscal(String direccionFiscal) {
        this.direccionFiscal = direccionFiscal;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", ruc=" + ruc +
                ", razonSocial='" + razonSocial + '\'' +
                ", direccionFiscal='" + direccionFiscal + '\'' +
                ", distrito='" + distrito + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", paginaWeb='" + paginaWeb + '\'' +
                '}';
    }
}