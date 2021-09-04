package com.elleo.sfpetclinic.bootstrap;

import com.elleo.sfpetclinic.model.Owner;
import com.elleo.sfpetclinic.model.PetType;
import com.elleo.sfpetclinic.model.Vet;
import com.elleo.sfpetclinic.services.OwnerService;
import com.elleo.sfpetclinic.services.PetTypeService;
import com.elleo.sfpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();

        owner1.setName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setName("Fiona");
        owner2.setLastName("Glennane");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();

        vet1.setName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

    }
}
