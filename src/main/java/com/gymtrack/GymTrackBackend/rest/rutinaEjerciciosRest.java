
package com.gymtrack.GymTrackBackend.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.gymtrack.GymTrackBackend.model.rutinaEjercicios;
import com.gymtrack.GymTrackBackend.service.rutinasEjerciciosService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/rutinaEjercicios")
public class rutinaEjerciciosRest {
    
    @Autowired
    private rutinasEjerciciosService rutinaEjerService;
    

    @PostMapping("/saveRutinaEjercicios")
    private ResponseEntity<rutinaEjercicios> saveEjercicio(@RequestBody rutinaEjercicios ejer) {
        if (ejer != null){
            rutinaEjercicios rutinaEjercicios = this.rutinaEjerService.save(ejer);
            return ResponseEntity.ok(rutinaEjercicios);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

   
}





