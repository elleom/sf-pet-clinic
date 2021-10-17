package com.elleo.sfpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "fist_name")
    private String name;
    @Column(name = "last_name")
    private String lastName;

}
