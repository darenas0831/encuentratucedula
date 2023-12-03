package com.registro.usuarios.modelo;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Collection;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "registro_Cedula", uniqueConstraints = @UniqueConstraint(columnNames ="cedula"))
public class RegistroCedula  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name= "nombre")
    private String nombre;

    @Column(name= "segundoNombre")
    private String segundoNombre;

    @Column(name= "apellido")
    private String apellido;

    @Column(name= "segundoApellido")
    private String segundoApellido;

    @Column(name= "cedula")
    private String cedula;

    @Column(name= "descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "registroCedula",
            cascade = CascadeType.ALL)
    private Collection<Rol> roles;

    public RegistroCedula(String nombre, String segundoNombre, String apellido,
                          String segundoApellido, String cedula, String descripcion, List<Rol> roles) {
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.segundoApellido = segundoApellido;
        this.cedula = cedula;
        this.descripcion = descripcion;
        this.roles = roles;
    }
}
