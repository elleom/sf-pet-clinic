package com.elleo.sfpetclinic.repositories;

import com.elleo.sfpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author el_le
 * @since 05/10/2021 21:52
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
