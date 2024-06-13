package com.gymtrack.GymTrackBackend.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rutina_ejercicios")
public class rutinaEjercicios {
    
    @EmbeddedId
    private RutinaEjercicioId id;

    @ManyToOne
    @JoinColumn(name = "rutinaID", insertable = false, updatable = false)
    private rutinas rutina;

    @ManyToOne
    @JoinColumn(name = "ejercicioID", insertable = false, updatable = false)
    private ejercicios ejercicio;

    public RutinaEjercicioId getId() {
        return id;
    }

    public void setId(RutinaEjercicioId id) {
        this.id = id;
    }

    public rutinas getRutina() {
        return rutina;
    }

    public void setRutina(rutinas rutina) {
        this.rutina = rutina;
    }

    public ejercicios getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(ejercicios ejercicio) {
        this.ejercicio = ejercicio;
    }

 
    
}
