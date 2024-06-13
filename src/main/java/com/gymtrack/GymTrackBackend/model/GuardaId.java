package com.gymtrack.GymTrackBackend.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GuardaId implements Serializable {
    private String usuarioID;
    private Long rutinaID;

    public String getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(String usuarioID) {
        this.usuarioID = usuarioID;
    }

    public Long getRutinaID() {
        return rutinaID;
    }

    public void setRutinaID(Long rutinaID) {
        this.rutinaID = rutinaID;
    }

   
}
