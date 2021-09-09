package com.elleo.sfpetclinic.services;

import com.elleo.sfpetclinic.model.Pet;
import com.elleo.sfpetclinic.model.Specialty;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long> {

    @Override
    default Set<Pet> findAll() {
        return null;
    }

    @Override
    default Pet findbyId(Long aLong) {
        return null;
    }

    @Override
    default Pet save(Specialty object) {
        return null;
    }

    @Override
    default void delete(Pet object) {

    }

    @Override
    default void deleteByID(Long aLong) {

    }
}
