package com.gymtrack.GymTrackBackend.model;



// import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "ejercicios")
public class ejercicios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ejercicio;
    private String descripcion;
    private String nombre;
    private String tipo;
    private String imagen;
    private int likes = 0;
    private int dislikes = 0;
    @ManyToOne
    @JoinColumn(name = "dni")
    private usuarios dni;

    public Long getId_ejercicio() {
        return id_ejercicio;
    }

    public void setId_ejercicio(Long id_ejercicio) {
        this.id_ejercicio = id_ejercicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDisLikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public usuarios getDni() {
        return dni;
    }

    public void setDni(usuarios dni) {
        this.dni = dni;
    }

}
