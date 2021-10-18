package com.elleo.sfpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "speciality")
public class Speciality extends BaseEntity {

    /***
     * IMPORTANT:
     * does not need a vet mapping cause all is mapped on vet itself;
     */

    @Column(name = "description")
    private String description;

}
