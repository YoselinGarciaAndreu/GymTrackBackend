
package com.gymtrack.GymTrackBackend.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.gymtrack.GymTrackBackend.model.ejercicioEntrenamiento;
import com.gymtrack.GymTrackBackend.service.ejercicioEntrenamientoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/ejercicioEntrenamiento")
public class ejercicioEntrenamientoRest {
    
    @Autowired
    private ejercicioEntrenamientoService ejercicioEntrenamientoService;
    

    @PostMapping("/saveEjercicioEntrenamiento")
    private ResponseEntity<ejercicioEntrenamiento> saveRutinaUsuario(@RequestBody ejercicioEntrenamiento entrenamiento) {
        if (entrenamiento != null){
            ejercicioEntrenamiento ejerEntre = this.ejercicioEntrenamientoService.save(entrenamiento);
            return ResponseEntity.ok(ejerEntre);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

       @GetMapping("/rutina")
    private ResponseEntity<List<ejercicioEntrenamiento>> getByRutina(@RequestParam Long rutinaId) {
        List<ejercicioEntrenamiento> ejercicioEntrenamientoRutina = ejercicioEntrenamientoService.findByRutina(rutinaId);
        return ResponseEntity.ok(ejercicioEntrenamientoRutina);
    }
   
}





