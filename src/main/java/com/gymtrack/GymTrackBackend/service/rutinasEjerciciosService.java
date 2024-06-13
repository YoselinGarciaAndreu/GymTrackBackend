package com.gymtrack.GymTrackBackend.service;

import com.gymtrack.GymTrackBackend.model.rutinaEjercicios;
import com.gymtrack.GymTrackBackend.repository.rutinaEjerciciosReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class rutinasEjerciciosService{

    @Autowired
    private rutinaEjerciciosReposiroty rutinaEjerciciosReposiroty;

    public rutinaEjercicios save(rutinaEjercicios entity) {
        return rutinaEjerciciosReposiroty.save(entity);
    }

}


