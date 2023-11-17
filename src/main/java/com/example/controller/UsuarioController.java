package com.example.controller;

import com.example.model.Usuario;
import com.example.service.UsuarioService;
import com.example.service.UsuarioServiceImpl;
import jakarta.persistence.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    private UsuarioService servicio;

    public UsuarioController(UsuarioService service) {
        this.servicio = service;
    }

    /*
    GET http://localhost:8080/api/usuariosº
     */
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> findAll(){
        List<Usuario> usuarios = this.servicio.findAll();

        if (usuarios.isEmpty()){
            return ResponseEntity.notFound().build();

        }else {
            return ResponseEntity.ok(usuarios);
        }

    }


}
