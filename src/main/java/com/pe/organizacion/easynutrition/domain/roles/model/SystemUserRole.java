package com.pe.organizacion.easynutrition.domain.roles.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="roles")
public class SystemUserRole implements Serializable {

    private String roleId;

    private String name;

    private String description;

    private String enabled;

}
