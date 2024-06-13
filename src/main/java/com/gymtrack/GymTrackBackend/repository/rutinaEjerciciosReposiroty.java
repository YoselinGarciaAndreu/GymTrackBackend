package com.gymtrack.GymTrackBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gymtrack.GymTrackBackend.model.RutinaEjercicioId;
import com.gymtrack.GymTrackBackend.model.rutinaEjercicios;

public interface rutinaEjerciciosReposiroty extends JpaRepository<rutinaEjercicios, RutinaEjercicioId>{
    

}




    // @Query("SELECT e FROM ejercicios e WHERE e.nombre like :%nombreb% AND e.tipo = :tipob")
    // List<ejercicios> findByTipoByNombreContaining(String nombreb, String tipob);


    // @Query("Select e from ejercicios e where e.nombre LIKE  %?1%")
    // List<ejercicios> findByPlaceContainingIgnoreCase(String place);



// AND e.tipo = :tipo


// , String tipo