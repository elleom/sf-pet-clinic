package com.elleo.sfpetclinic.services.springdatajpa;

import com.elleo.sfpetclinic.model.Owner;
import com.elleo.sfpetclinic.repositories.OwnerRepository;
import com.elleo.sfpetclinic.repositories.PetRepository;
import com.elleo.sfpetclinic.repositories.PetTypeRepository;
import com.elleo.sfpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author el_le
 * @since 05/10/2021 22:01
 */

@Service
@Profile("springdatajpa")
public class OwnerSpringDataJPAService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSpringDataJPAService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        Optional<Owner> owner = ownerRepository.findById(aLong);
        return owner.orElse(null);
    }

    @Override
    public Owner save(Owner object) {
       return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return ownerRepository.findAllByLAstNameLike(lastName);
    }
}
