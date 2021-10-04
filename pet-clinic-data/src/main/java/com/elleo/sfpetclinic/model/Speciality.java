package com.elleo.sfpetclinic.model;

import javax.persistence.*;

@Entity
@Table(name = "speciality")
public class Speciality extends BaseEntity {

    /***
     * IMPORTANT:
     * does not need a vet mapping cause all is mapped on vet itself;
     */

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
