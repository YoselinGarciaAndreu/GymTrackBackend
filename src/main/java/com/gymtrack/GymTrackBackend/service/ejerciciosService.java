package com.gymtrack.GymTrackBackend.service;

import com.gymtrack.GymTrackBackend.model.ejercicios;
import com.gymtrack.GymTrackBackend.repository.ejerciciosReposiroty;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class ejerciciosService{

    @Autowired
    private ejerciciosReposiroty ejercicioReposiroty;

    public List<ejercicios> findAll() {
        return ejercicioReposiroty.findAll();
    }

    public ejercicios save(ejercicios entity) {
        return ejercicioReposiroty.save(entity);
    }

    public List<ejercicios> findByTipo(String tipo) {
        return ejercicioReposiroty.findByTipo(tipo);
    }

    //rutina
    public List<ejercicios> findByIdDeRutina(Long rutinaId) {
        return ejercicioReposiroty.findByRutina(rutinaId);
    }

    public List<ejercicios> findByDni(String dni) {
        return ejercicioReposiroty.findByDni_Dni(dni);
    }

    public List<ejercicios> findByNameSearch(String name) {
        return ejercicioReposiroty.findByNombreContaining(name);
    }

    public List<ejercicios> findByNameSearchAndTipo(String name, String tipo) {
        return ejercicioReposiroty.findByTipoByNombreContaining(name, tipo);
    }
    
    public Long sumLikesByUsuario (String dni){
    return ejercicioReposiroty.sumLikesByUsuario(dni);

   }

   public ejercicios findTopEjercicioByLikesForUsuario(String dni) {
        List<ejercicios> ejercicios = ejercicioReposiroty.findTopEjercicioByLikesForUsuario(dni, PageRequest.of(0, 1));
        if (!ejercicios.isEmpty()) {
            return ejercicios.get(0);
        }
        return null;
    }

}


