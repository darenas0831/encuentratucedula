package com.registro.usuarios.repositorio;

import com.registro.usuarios.modelo.RegistroCedula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroCedulaRepository extends JpaRepository<RegistroCedula,Long> {

}
