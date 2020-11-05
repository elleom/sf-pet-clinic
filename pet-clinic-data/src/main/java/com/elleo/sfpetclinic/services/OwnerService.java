package com.elleo.sfpetclinic.services;

import com.elleo.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
