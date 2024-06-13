package com.gymtrack.GymTrackBackend.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gymtrack.GymTrackBackend.model.usuarios;


public interface usuariosRepository extends JpaRepository<usuarios, String>{
    // List<usuarios> findByNombreUsuarioByContraseña(String nombreUsuario, String contraseña);
    List <usuarios> findByNombreUsuarioAndPassword(String nombreUsuario, String password);


}
