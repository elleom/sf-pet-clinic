package com.elleo.sfpetclinic.services.map;

import com.elleo.sfpetclinic.model.Visit;
import com.elleo.sfpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author el_le
 * @since 09/10/2021 15:14
 */
@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {


    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null
                || visit.getPet().getOwner() == null
                || visit.getPet().getId() == null
                || visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid visit");
        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
