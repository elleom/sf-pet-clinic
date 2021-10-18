package com.elleo.sfpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public class Person extends BaseEntity {

    @Column(name = "fist_name")
    private String name;
    @Column(name = "last_name")
    private String lastName;

}
