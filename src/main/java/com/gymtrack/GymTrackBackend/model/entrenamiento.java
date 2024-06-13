package com.gymtrack.GymTrackBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "entrenamiento")
public class entrenamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long entrenamientoID;

    private Date fecha;

    public Long getEntrenamientoID() {
        return entrenamientoID;
    }

    public void setEntrenamientoID(Long entrenamientoID) {
        this.entrenamientoID = entrenamientoID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


}
