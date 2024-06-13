
package com.gymtrack.GymTrackBackend.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.gymtrack.GymTrackBackend.model.estadisticasUsuario;
import com.gymtrack.GymTrackBackend.service.estadisticasUsuarioService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/estadisticasUsuario")
public class estadisticasUsuarioRest {
    
    @Autowired
    private estadisticasUsuarioService estadisticasUsuarioService;
    

    @PostMapping("/saveEstadisticas")
    private ResponseEntity<estadisticasUsuario> saveEstadisticas(@RequestBody estadisticasUsuario estadisticasUsuario) {
        if (estadisticasUsuario != null){
            estadisticasUsuario estadisticastest = this.estadisticasUsuarioService.save(estadisticasUsuario);
            return ResponseEntity.ok(estadisticastest);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

   
    @GetMapping("/actual")
    private ResponseEntity<estadisticasUsuario> getEstadisticasActual(@RequestParam String dni) {
        estadisticasUsuario estadisticasActuales = estadisticasUsuarioService.findTopByUsuarioOrderByFechaDesc(dni);
        return ResponseEntity.ok(estadisticasActuales);
    }


    @GetMapping("/ultimos")
    private ResponseEntity<List<estadisticasUsuario>> getUltimasEstadisticas(@RequestParam String dni) {
        List<estadisticasUsuario> estadisticasActuales = estadisticasUsuarioService.findTop7ByUsuarioOrderByFechaDesc(dni);
        return ResponseEntity.ok(estadisticasActuales);
    }
}





