package com.gymtrack.GymTrackBackend.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gymtrack.GymTrackBackend.model.estadisticasUsuario;

public interface estadisticasUsuarioRepository extends JpaRepository<estadisticasUsuario, Long>{
    
    // Método para obtener la última estadística de un usuario en concreto
    // @Query("SELECT e FROM estadisticasUsuario e WHERE e.dni.dni = :dni ORDER BY e.fecha DESC")
    // List<estadisticasUsuario> findTopByUsuarioOrderByFechaDesc(@Param("dni") String dni, Pageable pageable);

    @Query("SELECT e FROM estadisticasUsuario e WHERE e.dni.dni = :dni ORDER BY e.fecha DESC LIMIT 1")
    estadisticasUsuario findTopByUsuarioOrderByFechaDesc(@Param("dni") String dni);

    // Método para obtener las últimas 7 estadísticas de un usuario en concreto
    @Query("SELECT e FROM estadisticasUsuario e WHERE e.dni.dni = :dni ORDER BY e.fecha DESC LIMIT 7")
    List<estadisticasUsuario> findTop7ByUsuarioOrderByFechaDesc(@Param("dni") String dni);


    
}


