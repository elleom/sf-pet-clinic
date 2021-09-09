package com.elleo.sfpetclinic.services.map;

import com.elleo.sfpetclinic.model.Pet;
import com.elleo.sfpetclinic.model.Specialty;
import com.elleo.sfpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return PetService.super.findAll();
    }

    @Override
    public Pet findbyId(Long aLong) {
        return PetService.super.findbyId(aLong);
    }

    @Override
    public Pet save(Specialty object) {
        return PetService.super.save(object);
    }

    @Override
    public void delete(Pet object) {
        PetService.super.delete(object);
    }

    @Override
    public void deleteByID(Long aLong) {
        PetService.super.deleteByID(aLong);
    }
}

