package com.registro.usuarios.controlador.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegistroCedulaDTO {
    private  long id;
    private String nombre;
    private String segundoNombre;
    private String apellido;
    private String segundoApellido;
    private String cedula;
    private String descripcion;
}
