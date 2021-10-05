package com.elleo.sfpetclinic.repositories;

import com.elleo.sfpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author el_le
 * @since 05/10/2021 21:57
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
