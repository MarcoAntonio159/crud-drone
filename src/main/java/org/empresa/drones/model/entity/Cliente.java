package org.empresa.drones.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "dni", nullable = false, length = 8)
    private String dni;
    @NotEmpty
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @NotEmpty
    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;
    @NotNull
    @Column(name = "edad", nullable = false)
    private Integer edad;
    @NotEmpty
    @Column(name = "celular", nullable = false, length = 9)
    private String celular;
    @NotEmpty
    @Column(name = "correo", nullable = false, length = 30)
    private String correo;
    @NotEmpty
    @Column(name = "sexo", nullable = false, length = 10)
    private String sexo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                ", celular='" + celular + '\'' +
                ", correo='" + correo + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
