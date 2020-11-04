package com.elleo.sfpetclinic.services;

import com.elleo.sfpetclinic.model.Owner;
import com.elleo.sfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);

    Vet findById(long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
