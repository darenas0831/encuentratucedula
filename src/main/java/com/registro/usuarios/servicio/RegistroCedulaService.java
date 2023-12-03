package com.registro.usuarios.servicio;

import com.registro.usuarios.controlador.dto.RegistroCedulaDTO;
import com.registro.usuarios.modelo.RegistroCedula;

import java.util.List;

public interface RegistroCedulaService {

   RegistroCedula guardar(RegistroCedulaDTO cedulaDTO);


   List<RegistroCedula> listarCedulas();

}
