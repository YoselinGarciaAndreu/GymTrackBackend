
package com.gymtrack.GymTrackBackend.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.gymtrack.GymTrackBackend.model.rutinas;
import com.gymtrack.GymTrackBackend.service.rutinasService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/rutinas")
public class rutinasRest {
    
    @Autowired
    private rutinasService rutinasService;
    
    @GetMapping("/getRutinas")
    private ResponseEntity<List<rutinas>> getAllRutinas() {
        return ResponseEntity.ok(rutinasService.findAll());
    }


    @GetMapping("/getRutinasTop")
    private ResponseEntity<List<rutinas>> findTop4ByLikes() {
        return ResponseEntity.ok(rutinasService.findTop4ByLikes());
    }
    

    @PostMapping("/saveRutinas")
    private ResponseEntity<rutinas> saveRutinas(@RequestBody rutinas rutina) {
        if (rutina != null){
            rutinas rutinas1 = this.rutinasService.save(rutina);
            return ResponseEntity.ok(rutinas1);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/nombre")
        private ResponseEntity<List<rutinas>> getRutinasByNombre(@RequestParam String nombre) {
        List<rutinas> rutinasPorNombre = rutinasService.findByNombre(nombre);
        return ResponseEntity.ok(rutinasPorNombre);
    }
    


    @GetMapping("/dni")
    private ResponseEntity<List<rutinas>> getRutinasByDni(@RequestParam String dni) {
        List<rutinas> rutinasPorDni = rutinasService.findByDni(dni);
        return ResponseEntity.ok(rutinasPorDni);
    }


   @GetMapping("/guardado")
    private ResponseEntity<List<rutinas>> getRutinasByGuardado(@RequestParam String dni) {
        List<rutinas> rutinasPorGuardado = rutinasService.fidByGuardado(dni);
        return ResponseEntity.ok(rutinasPorGuardado);
    }


    // @GetMapping("/cantidad")
    // private Long countRutinasByUsuario(@RequestParam String dni) {
    //     Long rutinasPorDni = rutinasService.countRutinasByUsuario(dni);
    //     return rutinasPorDni;
    // }
    
    @GetMapping("/cantidadLikes")
    private Long sumLikesByUsuario(@RequestParam String dni) {
        Long rutinasPorDni = rutinasService.sumLikesByUsuario(dni);
        return rutinasPorDni;
    }

    @GetMapping("/masGustada")
    private ResponseEntity<rutinas> findRutinaWithMostLikes(@RequestParam String dni) {
        rutinas rutina = rutinasService.findTopRutinaByLikesForUsuario(dni);
        if (rutina != null) {
            return ResponseEntity.ok(rutina);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
