package com.gymtrack.GymTrackBackend.service;

import com.gymtrack.GymTrackBackend.model.ejercicioEntrenamiento;
import com.gymtrack.GymTrackBackend.repository.ejercicioEntrenamientoReposiroty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ejercicioEntrenamientoService{

    @Autowired
    private ejercicioEntrenamientoReposiroty ejercicioEntrenamientoReposiroty;

    public ejercicioEntrenamiento save(ejercicioEntrenamiento entity) {
        return ejercicioEntrenamientoReposiroty.save(entity);
    }

   public List<ejercicioEntrenamiento> findByRutina(Long rutinaId) {
        return ejercicioEntrenamientoReposiroty.findByRutina(rutinaId);
    }
    
}


