
package com.gymtrack.GymTrackBackend.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.gymtrack.GymTrackBackend.model.entrenamiento;
import com.gymtrack.GymTrackBackend.service.entrenamientoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/entrenamiento")
public class entrenamientoRest {
    
    @Autowired
    private entrenamientoService entrenaService;
    

    @PostMapping("/saveEntrenamiento")
    private ResponseEntity<entrenamiento> saveEntrenamiento(@RequestBody entrenamiento entrenamiento) {
        if (entrenamiento != null){
            entrenamiento entrenamientotest = this.entrenaService.save(entrenamiento);
            return ResponseEntity.ok(entrenamientotest);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

   
}





