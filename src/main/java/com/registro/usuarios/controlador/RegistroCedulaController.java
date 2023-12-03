package com.registro.usuarios.controlador;

import com.registro.usuarios.controlador.dto.RegistroCedulaDTO;
import com.registro.usuarios.servicio.RegistroCedulaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


    @Controller
    @RequestMapping("/registroCedula")
    public class RegistroCedulaController {
        private  RegistroCedulaService cedulaService;


        public RegistroCedulaController(RegistroCedulaService cedulaService) {

            this.cedulaService = cedulaService;
        }

        @ModelAttribute("registroCedula")
        public RegistroCedulaDTO retornarNuevoRegistroCedulaDTO() {

            return new RegistroCedulaDTO();
        }

        @GetMapping
        public String mostrarFormularioRegistroCedula() {
            return "registroCedula";
        }

        @PostMapping
        public String registrarCedula(@ModelAttribute("registroCedula") RegistroCedulaDTO registroCedulaDTO) {
            cedulaService.guardar(registroCedulaDTO);
            return "redirect:/index?exito";
        }

    }

