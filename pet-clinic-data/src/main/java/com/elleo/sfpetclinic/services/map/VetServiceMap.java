package com.elleo.sfpetclinic.services.map;

import com.elleo.sfpetclinic.model.Vet;
import com.elleo.sfpetclinic.services.CrudService;
import com.elleo.sfpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
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
        return super.save(object.getId(), object);
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
