package com.example.service;

import com.example.model.Accesos;
import com.example.repository.AccesoRepository;
import com.example.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccesoServiceImpl implements AccesoService {

    private AccesoRepository repositorio;

    public AccesoServiceImpl(AccesoRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Accesos> findAll() {
        return this.repositorio.findAll();
    }

}
