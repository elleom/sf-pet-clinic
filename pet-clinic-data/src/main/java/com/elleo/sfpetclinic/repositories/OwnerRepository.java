package com.elleo.sfpetclinic.repositories;

import com.elleo.sfpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author el_le
 * @since 05/10/2021 21:52
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String name);
    List<Owner> findAllByLastNameLike(String lastName);
}
