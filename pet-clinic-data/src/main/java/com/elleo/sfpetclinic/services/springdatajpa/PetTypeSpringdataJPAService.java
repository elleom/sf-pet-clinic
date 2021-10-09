package com.elleo.sfpetclinic.services.springdatajpa;

import com.elleo.sfpetclinic.model.PetType;
import com.elleo.sfpetclinic.repositories.PetTypeRepository;
import com.elleo.sfpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author el_le
 * @since 09/10/2021 14:27
 */
@Service
@Profile("springdatajpa")
public class PetTypeSpringdataJPAService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSpringdataJPAService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
