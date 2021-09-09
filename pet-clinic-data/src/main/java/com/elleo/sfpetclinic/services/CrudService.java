package com.elleo.sfpetclinic.services;

import com.elleo.sfpetclinic.model.Specialty;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();
    T findbyId(ID id);
    T save (Specialty object);

    void delete(T object);

    void deleteByID(ID id);


}
