package com.gymtrack.GymTrackBackend.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ejercicio_entrenamiento")
public class ejercicioEntrenamiento {
    
    @EmbeddedId
    private EjercicioEntrenamientoId id;

    @ManyToOne
    @JoinColumn(name = "entrenamientoID", insertable = false, updatable = false)
    private entrenamiento entrenamiento;

    @ManyToOne
    @JoinColumn(name = "rutinaID", insertable = false, updatable = false)
    private rutinas rutina;

    @ManyToOne
    @JoinColumn(name = "ejercicioID", insertable = false, updatable = false)
    private ejercicios ejercicio;

    private double primeraSerie;
    private double segundaSerie;
    private double terceraSerie;

    public EjercicioEntrenamientoId getId() {
        return id;
    }

    public void setId(EjercicioEntrenamientoId id) {
        this.id = id;
    }

    public entrenamiento getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(entrenamiento entrenamiento) {
        this.entrenamiento = entrenamiento;
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

    public double getPrimeraSerie() {
        return primeraSerie;
    }

    public void setPrimeraSerie(double primeraSerie) {
        this.primeraSerie = primeraSerie;
    }

    public double getSegundaSerie() {
        return segundaSerie;
    }

    public void setSegundaSerie(double segundaSerie) {
        this.segundaSerie = segundaSerie;
    }

    public double getTerceraSerie() {
        return terceraSerie;
    }

    public void setTerceraSerie(double terceraSerie) {
        this.terceraSerie = terceraSerie;
    }

   
}
