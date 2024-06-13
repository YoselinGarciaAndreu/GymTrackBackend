package com.gymtrack.GymTrackBackend.repository;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gymtrack.GymTrackBackend.model.rutinas;


public interface rutinasRepository extends JpaRepository<rutinas, Long>{

    
    List<rutinas> findByDni_Dni(String dni);

    @Query("SELECT r FROM rutinas r ORDER BY r.likes DESC")
    List<rutinas> findTop4ByLikes(Pageable pageable);

    @Query("SELECT r FROM rutinas r JOIN guarda g ON r.rutinaID = g.id.rutinaID JOIN usuarios u ON r.dni.dni = u.dni WHERE g.id.usuarioID = :dni")
    List<rutinas> getRutinasByGuardado(@Param("dni") String dni);


    @Query("SELECT e FROM rutinas e WHERE e.nombre LIKE CONCAT('%', :nombreb, '%')")
    List<rutinas> findRutinasByNombreContaining(@Param("nombreb") String nombreb);

 
     // Cantidad total de likes de las rutinas de un usuario
     @Query("SELECT SUM(r.likes) FROM rutinas r WHERE r.dni.dni = :dni")
     Long sumLikesByUsuario(@Param("dni") String dni);
 
    //  Rutina con más likes
    @Query("SELECT r FROM rutinas r WHERE r.dni.dni = :dni ORDER BY r.likes DESC")
    List<rutinas> findTopRutinaByLikesForUsuario(@Param("dni") String dni, Pageable pageable);
}
