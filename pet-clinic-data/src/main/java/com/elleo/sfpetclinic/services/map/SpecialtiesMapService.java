package com.elleo.sfpetclinic.services.map;

import com.elleo.sfpetclinic.model.Specialty;
import com.elleo.sfpetclinic.services.SpecialtyService;

import java.util.Set;

public class SpecialtiesMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findbyId(Long id) {
        return super.findById(id);
    }
}
