package com.elleo.sfpetclinic.services.map;

import com.elleo.sfpetclinic.model.Pet;
import com.elleo.sfpetclinic.model.PetType;
import com.elleo.sfpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return PetTypeService.super.findAll();
    }

    @Override
    public PetType findbyId(Long id) {
        return PetTypeService.super.findbyId(id);
    }

    @Override
    public PetType save(PetType object) {
        return PetTypeService.super.save(object);
    }

    @Override
    public void delete(PetType object) {
        PetTypeService.super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        PetTypeService.super.deleteByID(id);
    }
}
