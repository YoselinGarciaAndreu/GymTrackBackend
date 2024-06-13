package com.gymtrack.GymTrackBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

// import org.springframework.security.crypto.password.PasswordEncoder;


import org.springframework.stereotype.Service;

import com.gymtrack.GymTrackBackend.model.usuarios;
import com.gymtrack.GymTrackBackend.repository.usuariosRepository;

@Service
public class usuariosService{

    @Autowired
    private usuariosRepository usuariosRepository;

public List<usuarios> fidByNombrePassword(String nombreUsuario, String password) {
        return usuariosRepository.findByNombreUsuarioAndPassword(nombreUsuario, password);
    }

public usuarios save(usuarios entity) {
        return usuariosRepository.save(entity);
    }
    
    
}
