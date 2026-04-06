package com.example.fixnow.service;

import com.example.fixnow.model.Incidencia;
import com.example.fixnow.repository.IncidenciaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IncidenciaService {
    @Autowired
    private IncidenciaRepository inciRepo;

    public List<Incidencia> getIncidencias(){
        return inciRepo.verIncidencias();
    }

    public Incidencia saveIncidencia(Incidencia inci){
        return inciRepo.guardarIncidencia(inci);
    }

    public Incidencia getIncidenciaId(int id){
        return inciRepo.buscarPorId(id);
    }

    public Incidencia updateIncidencia(Incidencia inci){
        return inciRepo.actualizarIncidencia(inci);
    }

    public String deleteIncidencia(int id){
        inciRepo.borrarIncidencia(id);
        return "Incidencia Borrada!";
    }
}
