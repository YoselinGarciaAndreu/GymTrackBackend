package com.gymtrack.GymTrackBackend.service;

import com.gymtrack.GymTrackBackend.model.guarda;
import com.gymtrack.GymTrackBackend.repository.guardaReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class guardaService{

    @Autowired
    private guardaReposiroty guardaReposiroty;

    public guarda save(guarda entity) {
        return guardaReposiroty.save(entity);
    }

}


