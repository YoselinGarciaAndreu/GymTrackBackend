/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymtrack.GymTrackBackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gymtrack.GymTrackBackend.model.usuarios;
import com.gymtrack.GymTrackBackend.service.usuariosService;


// import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Jose Luis
 */

@RestController
@RequestMapping ("/usuarios/")
public class usuariosRest {
    
    @Autowired
    private usuariosService usuariosService;

    @GetMapping("/login")
    private ResponseEntity<List<usuarios>> getUsuariosByNombrePassword(@RequestParam String nombreUsuario, @RequestParam String password) {
        List<usuarios> usuNombrePassword = usuariosService.fidByNombrePassword(nombreUsuario, password);
        return ResponseEntity.ok(usuNombrePassword);
    }

    @PostMapping("/saveUsuario")
    private ResponseEntity<usuarios> saveRutinas(@RequestBody usuarios usuario) {
        if (usuario != null){
            usuarios usu = this.usuariosService.save(usuario);
            return ResponseEntity.ok(usu);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
}

