package com.elleo.sfpetclinic.bootstrap;

import com.elleo.sfpetclinic.model.Owner;
import com.elleo.sfpetclinic.model.Vet;
import com.elleo.sfpetclinic.services.OwnerService;
import com.elleo.sfpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setName("Fiona");
        owner2.setLastName("Glennane");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

    }
}
