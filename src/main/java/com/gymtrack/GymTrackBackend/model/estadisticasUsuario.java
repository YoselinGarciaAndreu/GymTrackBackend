package com.gymtrack.GymTrackBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import java.util.Date;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "estadisticasUsuario")
public class estadisticasUsuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estadisticasID;
    private Date fecha;
    private double masaMuscular = 0;
    private double altura = 0;
    private double grasa = 0;
    private double peso = 0;

    @ManyToOne
    @JoinColumn(name = "dni")
    private usuarios dni;
    
    public usuarios getDNI(){
        return dni;
    }
    public void setDNI(usuarios dni) {
        this.dni = dni;
    }
    public Long getRutinaID() {
        return estadisticasID;
    }

    public void setRutinaID(Long estadisticasID) {
        this.estadisticasID = estadisticasID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMasaMuscular() {
        return masaMuscular;
    }

    public void setMasaMuscular(double masaMuscular) {
        this.masaMuscular = masaMuscular;
    }

    public double getAltura() {
        return altura;
    }

    public void setLikes(double altura) {
        this.altura = altura;
    }
    
    public double getGrasa() {
        return grasa;
    }

    public void setGrasa(double grasa) {
        this.grasa = grasa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
