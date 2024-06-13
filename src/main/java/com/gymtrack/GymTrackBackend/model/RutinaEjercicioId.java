package com.gymtrack.GymTrackBackend.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RutinaEjercicioId implements Serializable {
    private Long rutinaID;
    private Long ejercicioID;

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
