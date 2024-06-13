package com.gymtrack.GymTrackBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gymtrack.GymTrackBackend.model.EjercicioEntrenamientoId;
import com.gymtrack.GymTrackBackend.model.ejercicioEntrenamiento;

public interface ejercicioEntrenamientoReposiroty extends JpaRepository<ejercicioEntrenamiento, EjercicioEntrenamientoId>{


    @Query("SELECT ee FROM ejercicioEntrenamiento ee JOIN ee.entrenamiento e WHERE ee.id.rutinaID = :rutinaID")
    List<ejercicioEntrenamiento> findByRutina(@Param("rutinaID") Long rutinaID);

}


// , e.fecha

