package com.areg.tickets.models;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Ticket {
    private String titulo;
    private String descripcion;
    private String estado;
    private String prioridad;
    private Usuario usuario;
    private LocalDate fechaCreacion;
    private LocalDate ultimaActualizacion;
    private List<String> comentarios;
    private List<String> adjuntos;
    private String categria;
}
