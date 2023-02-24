package com.pe.organizacion.easynutrition.domain.users.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="users")
public class SystemUser implements Serializable {

    //TODO CAMBIAR LOS STRINGS POR TIPO DE DATO ESPECIFICO PARA CADA ATRIBUTO, EJM UID TIENE QUE SER DE TIPO SystemUserUId uid;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="uid")
    private String uId;

    private String username;

    private String password;

    private String enabled;

}
