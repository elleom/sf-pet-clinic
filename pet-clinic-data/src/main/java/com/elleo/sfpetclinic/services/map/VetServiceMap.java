package com.elleo.sfpetclinic.services.map;

import com.elleo.sfpetclinic.model.Specialty;
import com.elleo.sfpetclinic.model.Vet;
import com.elleo.sfpetclinic.services.SpecialtyService;
import com.elleo.sfpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findbyId(Long aLong) {
        return super.findById(aLong);
    }


    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(specialty -> {
                if (specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void deleteByID(Long aLong) {
            super.deleteById(aLong);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
