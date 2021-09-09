package com.elleo.sfpetclinic.services;

import com.elleo.sfpetclinic.model.PetType;
import com.elleo.sfpetclinic.model.Specialty;

import java.util.Set;

public interface PetTypeService extends CrudService <PetType, Long> {

    @Override
    default Set<PetType> findAll() {
        return null;
    }

    @Override
    default PetType findbyId(Long aLong) {
        return null;
    }

    @Override
    default PetType save(Specialty object) {
        return null;
    }

    @Override
    default void delete(PetType object) {

    }

    @Override
    default void deleteByID(Long aLong) {

    }
}
