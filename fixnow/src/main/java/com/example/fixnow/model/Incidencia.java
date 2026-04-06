package com.example.fixnow.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Incidencia {
    private int id; 
    private String descripcion;
    private String estado; 
    private int nivelPrioridad;
    private String usuarioReporte;
    private String fechaRegistro;
}
