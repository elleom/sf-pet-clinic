package com.elleo.sfpetclinic.services.map;

import com.elleo.sfpetclinic.model.Owner;
import com.elleo.sfpetclinic.services.CrudService;
import com.elleo.sfpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findbyId(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
