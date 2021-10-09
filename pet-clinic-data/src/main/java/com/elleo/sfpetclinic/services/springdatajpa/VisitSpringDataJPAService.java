package com.elleo.sfpetclinic.services.springdatajpa;

import com.elleo.sfpetclinic.model.Visit;
import com.elleo.sfpetclinic.repositories.VisitRepository;
import com.elleo.sfpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author el_le
 * @since 09/10/2021 15:15
 */
@Service
@Profile("springdatajpa")
public class VisitSpringDataJPAService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSpringDataJPAService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);

    }
}
