package com.elleo.sfpetclinic.repositories;

import com.elleo.sfpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author el_le
 * @since 05/10/2021 21:55
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
