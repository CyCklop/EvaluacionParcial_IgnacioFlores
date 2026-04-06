package com.example.fixnow.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//import java.util.HashMap;
//import java.util.Map;
import java.util.List;

import com.example.fixnow.model.Incidencia;
import com.example.fixnow.service.IncidenciaService;
//import com.example.fixnow.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/v1/incidencias")
public class IncidenciaController {
    @Autowired
    private IncidenciaService inciService;

    @PostMapping
    public Incidencia agregarIncidencia(@RequestBody Incidencia inci){
        return inciService.saveIncidencia(inci);
    }

    @GetMapping()
    public List<Incidencia> listarIncidencias(){
        return inciService.getIncidencias();
    }

    @GetMapping("{id}")
    public Incidencia buscarIncidenciaPorId(@PathVariable int id){
        return inciService.getIncidenciaId(id);
    }

    @PutMapping("{id}")
    public Incidencia actualizarIncidencia(@PathVariable int id, @RequestBody Incidencia inci){
        return inciService.updateIncidencia(inci);
    }

    @DeleteMapping("{id}")
    public String borrarIncidencia(@PathVariable int id){
        return inciService.deleteIncidencia(id);
    }
}
