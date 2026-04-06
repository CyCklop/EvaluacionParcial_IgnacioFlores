package com.example.fixnow.repository;

import com.example.fixnow.model.Incidencia;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository
public class IncidenciaRepository {
    private List<Incidencia> listaIncidencias = new ArrayList<>();

    public Incidencia buscarPorId(int id){
        for(Incidencia inci : listaIncidencias){
            if(inci.getId() == id){
                return inci;
            }
        }
        return null;
    }

    public List<Incidencia> verIncidencias(){
        return listaIncidencias;
    }
    
    public Incidencia guardarIncidencia(Incidencia inci){
        listaIncidencias.add(inci);
        return inci;
    }

    public Incidencia actualizarIncidencia(Incidencia inci){
        int id = 0;
        int posicionId = 0;

        for(int i = 0; i < listaIncidencias.size(); i++){
            if(listaIncidencias.get(i).getId() == inci.getId()){
                id = inci.getId();
                posicionId = i;
            }
        }

        Incidencia incidencia1 = new Incidencia();
        incidencia1.setId(id);
        incidencia1.setDescripcion(inci.getDescripcion());
        incidencia1.setEstado(inci.getEstado());
        incidencia1.setNivelPrioridad(inci.getNivelPrioridad());
        incidencia1.setUsuarioReporte(inci.getUsuarioReporte());
        incidencia1.setFechaRegistro(inci.getFechaRegistro());

        listaIncidencias.set(posicionId, incidencia1);
        return incidencia1;
    }

    public void borrarIncidencia(int id){
        Incidencia inci = buscarPorId(id);
        if(inci != null){
            listaIncidencias.remove(inci);
        }
    }
}
