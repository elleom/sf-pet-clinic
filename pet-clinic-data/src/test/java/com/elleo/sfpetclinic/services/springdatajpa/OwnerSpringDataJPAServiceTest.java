package com.elleo.sfpetclinic.services.springdatajpa;

import com.elleo.sfpetclinic.model.Owner;
import com.elleo.sfpetclinic.repositories.OwnerRepository;
import com.elleo.sfpetclinic.repositories.PetRepository;
import com.elleo.sfpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

/**
 * @author el_le
 * @since 07/11/2021 19:31
 */

@ExtendWith(MockitoExtension.class)
class OwnerSpringDataJPAServiceTest {

    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSpringDataJPAService ownerSpringDataJPAService;

    final String LAST_NAME = "Smith";
    Owner returnOwner;

    @BeforeEach
    void setUp() {
       returnOwner  = Owner.builder().id(1L).lastName("Smith").build();
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnerSet = new HashSet<>();
        returnOwnerSet.add(Owner.builder().id(1L).build());
        returnOwnerSet.add(Owner.builder().id(2L).build());

        Set<Owner> owners = ownerSpringDataJPAService.findAll();
        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
        Owner owner = ownerSpringDataJPAService.findById(1L);
        assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());
        Owner owner = ownerSpringDataJPAService.findById(1L);
        assertNull(owner);
    }

    @Test
    void save() {
        Owner ownerToSave = Owner.builder().id(1L).build();
        when(ownerRepository.save(any())).thenReturn(returnOwner);
        Owner savedOwner = ownerSpringDataJPAService.save(ownerToSave);
        assertNotNull(savedOwner);
        verify(ownerRepository).save(any());
    }

    @Test
    void delete() {
        ownerSpringDataJPAService.delete(returnOwner);
        //default is 1 times
        verify(ownerRepository, times(1)).delete(any());
    }

    @Test
    void deleteById() {
        ownerSpringDataJPAService.deleteById(1L);

        verify(ownerRepository).deleteById(anyLong());
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
        Owner smith = ownerSpringDataJPAService.findByLastName(LAST_NAME);
        assertEquals(LAST_NAME, smith.getLastName());
        verify(ownerRepository.findByLastName(any()));
    }
}