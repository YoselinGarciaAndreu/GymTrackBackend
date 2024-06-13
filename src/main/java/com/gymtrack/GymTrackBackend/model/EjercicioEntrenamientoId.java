package com.gymtrack.GymTrackBackend.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EjercicioEntrenamientoId implements Serializable {
    private Long entrenamientoID;
    private Long rutinaID;
    private Long ejercicioID;

    public Long getEntrenamientoID() {
        return entrenamientoID;
    }

    public void setEntrenamientoID(Long entrenamientoID) {
        this.entrenamientoID = entrenamientoID;
    }

    public Long getRutinaID() {
        return rutinaID;
    }

    public void setRutinaID(Long rutinaID) {
        this.rutinaID = rutinaID;
    }

    public Long getEjercicioID() {
        return ejercicioID;
    }

    public void setEjercicioID(Long ejercicioID) {
        this.ejercicioID = ejercicioID;
    }

   
}
