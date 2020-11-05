package com.elleo.sfpetclinic.services;

import com.elleo.sfpetclinic.model.Owner;
import com.elleo.sfpetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);

}
