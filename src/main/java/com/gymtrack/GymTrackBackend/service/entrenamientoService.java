package com.gymtrack.GymTrackBackend.service;

import com.gymtrack.GymTrackBackend.model.entrenamiento;
import com.gymtrack.GymTrackBackend.repository.entrenamientoReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class entrenamientoService{

    @Autowired
    private entrenamientoReposiroty entrenamientoReposiroty;

    public entrenamiento save(entrenamiento entity) {
        return entrenamientoReposiroty.save(entity);
    }

}


