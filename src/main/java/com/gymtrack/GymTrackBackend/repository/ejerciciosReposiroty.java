package com.gymtrack.GymTrackBackend.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gymtrack.GymTrackBackend.model.ejercicios;

public interface ejerciciosReposiroty extends JpaRepository<ejercicios, Long>{
    List<ejercicios> findByTipo(String tipo);

    List<ejercicios> findByDni_Dni(String dni);

    List<ejercicios> findByNombreContaining(String nombre);


    @Query("SELECT e FROM ejercicios e WHERE e.nombre LIKE CONCAT('%', :nombreb, '%') AND e.tipo = :tipob")
        List<ejercicios> findByTipoByNombreContaining(@Param("nombreb") String nombreb, @Param("tipob") String tipob);


    @Query("SELECT e FROM ejercicios e JOIN rutinaEjercicios re ON e.id_ejercicio = re.id.ejercicioID WHERE re.id.rutinaID = :rutinaID")
        List<ejercicios> findByRutina(@Param("rutinaID") Long rutinaID);

     // Cantidad total de likes de los ejercicios de un usuario
     @Query("SELECT SUM(e.likes) FROM ejercicios e WHERE e.dni.dni = :dni")
        Long sumLikesByUsuario(@Param("dni") String dni);
 
    //  Ejercicio con más likes
    @Query("SELECT e FROM ejercicios e WHERE e.dni.dni = :dni ORDER BY e.likes DESC")
        List<ejercicios> findTopEjercicioByLikesForUsuario(@Param("dni") String dni, Pageable pageable);

}


