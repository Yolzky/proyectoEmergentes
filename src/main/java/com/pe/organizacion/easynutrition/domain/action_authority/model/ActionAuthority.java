package com.pe.organizacion.easynutrition.domain.action_authority.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Entity
@Table(name="action_authorities")
public class ActionAuthority{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    private String description;

}
