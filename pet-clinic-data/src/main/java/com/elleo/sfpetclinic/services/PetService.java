package com.elleo.sfpetclinic.services;

import com.elleo.sfpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
