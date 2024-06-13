package com.gymtrack.GymTrackBackend.service;

import com.gymtrack.GymTrackBackend.model.rutinas;
// import com.gymtrack.GymTrackBackend.model.usuarios;

import java.util.List;
// import java.util.Objects;
// import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import com.gymtrack.GymTrackBackend.repository.rutinasRepository;

import org.springframework.stereotype.Service;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

@Service
public class rutinasService{

    //private static final Logger logger = LoggerFactory.getLogger(rutinasService.class);

    @Autowired
    private rutinasRepository rutinasRepository;

    public List<rutinas> findAll() {
        return rutinasRepository.findAll();
    }

    public rutinas save(rutinas entity) {
        return rutinasRepository.save(entity);
    }

    public List<rutinas> findByDni(String dni) {
        return rutinasRepository.findByDni_Dni(dni);
    }

    public List<rutinas> fidByGuardado(String dni) {
        return rutinasRepository.getRutinasByGuardado(dni);
    }
    
      public List<rutinas> findByNombre(String nombre) {
        return rutinasRepository.findRutinasByNombreContaining(nombre);
    }

//    public Long countRutinasByUsuario (String dni){
//     return rutinasRepository.countRutinasByUsuarioTest(dni);

//    }

   public Long sumLikesByUsuario (String dni){
    return rutinasRepository.sumLikesByUsuario(dni);

   }

   public rutinas findTopRutinaByLikesForUsuario(String dni) {
        List<rutinas> rutinas = rutinasRepository.findTopRutinaByLikesForUsuario(dni, PageRequest.of(0, 1));
        if (!rutinas.isEmpty()) {
            return rutinas.get(0);
        }
        return null;
    }
    public List<rutinas> findTop4ByLikes() {
        return rutinasRepository.findTop4ByLikes(PageRequest.of(0, 4));
    }

}
