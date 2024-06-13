package com.gymtrack.GymTrackBackend.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "guarda")
public class guarda {
    
    @EmbeddedId
    private GuardaId id;

    @ManyToOne
    @JoinColumn(name = "usuarioID", insertable = false, updatable = false)
    private usuarios usuario;

    @ManyToOne
    @JoinColumn(name = "rutinaID", insertable = false, updatable = false)
    private rutinas rutina;

    public GuardaId getId() {
        return id;
    }

    public void setId(GuardaId id) {
        this.id = id;
    }

    public usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(usuarios usuario) {
        this.usuario = usuario;
    }

    public rutinas getRutina() {
        return rutina;
    }

    public void setRutina(rutinas rutina) {
        this.rutina = rutina;
    }


}
