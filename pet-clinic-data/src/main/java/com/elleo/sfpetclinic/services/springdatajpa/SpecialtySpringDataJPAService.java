package com.elleo.sfpetclinic.services.springdatajpa;

import com.elleo.sfpetclinic.model.Speciality;
import com.elleo.sfpetclinic.repositories.SpecialtyRepository;
import com.elleo.sfpetclinic.services.SpecialtiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author el_le
 * @since 09/10/2021 14:42
 */
@Service
@Profile("springdatajpa")
public class SpecialtySpringDataJPAService implements SpecialtiesService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtySpringDataJPAService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialtyRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
