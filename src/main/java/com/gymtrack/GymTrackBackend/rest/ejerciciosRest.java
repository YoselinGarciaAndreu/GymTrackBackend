
package com.gymtrack.GymTrackBackend.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.gymtrack.GymTrackBackend.model.ejercicios;
import com.gymtrack.GymTrackBackend.service.ejerciciosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/ejercicios")
public class ejerciciosRest {
    
    @Autowired
    private ejerciciosService ejerService;
    
    @GetMapping("/getEjercicios")
    private ResponseEntity<List<ejercicios>> getAllEjercicios() {
        return ResponseEntity.ok(ejerService.findAll());
    }

    @PostMapping("/saveEjercicios")
    private ResponseEntity<ejercicios> saveEjercicio(@RequestBody ejercicios ejer) {
        if (ejer != null){
            ejercicios ejercicios1 = this.ejerService.save(ejer);
            return ResponseEntity.ok(ejercicios1);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/tipo")
    private ResponseEntity<List<ejercicios>> getEjerciciosByTipo(@RequestParam String tipo) {
        List<ejercicios> ejerciciosPorTipo = ejerService.findByTipo(tipo);
        return ResponseEntity.ok(ejerciciosPorTipo);
    }

    @GetMapping("/byRutina")
    private ResponseEntity<List<ejercicios>> getEjerciciosByRutina(@RequestParam Long rutinaId) {
        List<ejercicios> ejerciciosPorRutina = ejerService.findByIdDeRutina(rutinaId);
        return ResponseEntity.ok(ejerciciosPorRutina);
    }

    @GetMapping("/dni")
    private ResponseEntity<List<ejercicios>> getEjerciciosByDni(@RequestParam String dni) {
        List<ejercicios> ejerciciosPorDni = ejerService.findByDni(dni);
        return ResponseEntity.ok(ejerciciosPorDni);
    }


    @GetMapping("/nombreSearch")
    private ResponseEntity<List<ejercicios>> getEjerciciosByNombreSearch(@RequestParam String nombre) {
        List<ejercicios> ejerciciosPorNombre = ejerService.findByNameSearch(nombre);
        return ResponseEntity.ok(ejerciciosPorNombre);
    }

    @GetMapping("/nombreSearchTipo")
    private ResponseEntity<List<ejercicios>> getEjerciciosByNombreSearchTipo(@RequestParam String nombre,@RequestParam String tipo) {
        List<ejercicios> ejerciciosPorNombreTipo = ejerService.findByNameSearchAndTipo(nombre, tipo);
        return ResponseEntity.ok(ejerciciosPorNombreTipo);
    }

    @GetMapping("/cantidadLikes")
    private Long sumLikesByUsuario(@RequestParam String dni) {
        Long rutinasPorDni = ejerService.sumLikesByUsuario(dni);
        return rutinasPorDni;
    }

    @GetMapping("/masGustado")
    private ResponseEntity<ejercicios> findRutinaWithMostLikes(@RequestParam String dni) {
        ejercicios ejercicio = ejerService.findTopEjercicioByLikesForUsuario(dni);
        if (ejercicio != null) {
            return ResponseEntity.ok(ejercicio);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}





