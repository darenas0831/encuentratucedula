package com.registro.usuarios.servicio;

import com.registro.usuarios.controlador.dto.RegistroCedulaDTO;

import com.registro.usuarios.modelo.RegistroCedula;
import com.registro.usuarios.modelo.Rol;
import com.registro.usuarios.repositorio.RegistroCedulaRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RegistroCedulaServiceImpl implements RegistroCedulaService {

    private final RegistroCedulaRepository cedulaRepository;

    public RegistroCedulaServiceImpl(RegistroCedulaRepository cedulaRepository) {
        this.cedulaRepository = cedulaRepository;
    }
        public RegistroCedula guardar(RegistroCedulaDTO registroCedulaDTO) {

        List<Rol> roles = Arrays.asList(new Rol("ROLE_USER"));

        RegistroCedula registroCedula =new RegistroCedula(

                registroCedulaDTO.getNombre(),
                registroCedulaDTO.getSegundoNombre(),
                registroCedulaDTO.getApellido(),
                registroCedulaDTO.getSegundoApellido(),
                registroCedulaDTO.getCedula(),
                registroCedulaDTO.getDescripcion(),roles

        );
        return cedulaRepository.save(registroCedula);
    }
    @Override
    public List<RegistroCedula> listarCedulas() {
        return cedulaRepository.findAll();
    }


}
