
package com.gymtrack.GymTrackBackend.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.gymtrack.GymTrackBackend.model.guarda;
import com.gymtrack.GymTrackBackend.service.guardaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/guarda")
public class guardaRest {
    
    @Autowired
    private guardaService guardService;
    

    @PostMapping("/saveRutinaUsuario")
    private ResponseEntity<guarda> saveRutinaUsuario(@RequestBody guarda guardado) {
        if (guardado != null){
            guarda guardatest = this.guardService.save(guardado);
            return ResponseEntity.ok(guardatest);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

   
}





