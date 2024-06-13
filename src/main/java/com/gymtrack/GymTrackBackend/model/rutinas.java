package com.gymtrack.GymTrackBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
// import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rutinas")
public class rutinas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rutinaID;
    @Column(nullable = false)
    private String nombre;
    private String descripcion;
    private String imagen;
    private int likes = 0;
    private int dislikes = 0;
    @ManyToOne
    @JoinColumn(name = "dni")
    private usuarios dni;
    
    public usuarios getDNI(){
        return dni;
    }

    public Long getRutinaID() {
        return rutinaID;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public void setRutinaID(Long rutinaID) {
        this.rutinaID = rutinaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
}
