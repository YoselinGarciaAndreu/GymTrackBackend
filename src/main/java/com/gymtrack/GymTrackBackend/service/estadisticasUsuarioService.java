package com.gymtrack.GymTrackBackend.service;

import com.gymtrack.GymTrackBackend.model.estadisticasUsuario;
import com.gymtrack.GymTrackBackend.repository.estadisticasUsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class estadisticasUsuarioService{

    @Autowired
    private estadisticasUsuarioRepository estadisticasUsuarioRepository;

    public estadisticasUsuario save(estadisticasUsuario entity) {
        return estadisticasUsuarioRepository.save(entity);
    }

    public estadisticasUsuario findTopByUsuarioOrderByFechaDesc(String dni){
        return estadisticasUsuarioRepository.findTopByUsuarioOrderByFechaDesc(dni);
    }

    public List<estadisticasUsuario> findTop7ByUsuarioOrderByFechaDesc(String dni){
        return estadisticasUsuarioRepository.findTop7ByUsuarioOrderByFechaDesc(dni);
        
    }

}


