package com.example.controller;

import com.example.model.Accesos;
import com.example.service.AccesoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccesoController {
    private AccesoService servicio;

    public AccesoController(AccesoService service) {
        this.servicio = service;
    }

    /*
        GET http://localhost:8080/api/accesos
         */
    @GetMapping("/accesos")
    public ResponseEntity<List<Accesos>> findAll(){
        List<Accesos> accesos = this.servicio.findAll();

        if (accesos.isEmpty()){
            return ResponseEntity.notFound().build();

        }else {
            return ResponseEntity.ok(accesos);
        }

    }
}
