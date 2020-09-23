package polkins.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import polkins.springframework.sfgpetclinic.map.OwnerMapService;
import polkins.springframework.sfgpetclinic.map.VetMapService;
import polkins.springframework.sfgpetclinic.model.Owner;
import polkins.springframework.sfgpetclinic.model.Vet;
import polkins.springframework.sfgpetclinic.services.OwnerService;
import polkins.springframework.sfgpetclinic.services.VetService;

@Component
public class BootstrapLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;

    public BootstrapLoader() {
        this.vetService = new VetMapService();
        this.ownerService = new OwnerMapService();
    }

    @Override
    public void run(String... args) {

        Owner owner1 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Elvis");
        owner1.setLastName("Presly");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(4L);
        owner2.setFirstName("Deny");
        owner2.setLastName("Villeneuve");

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setId(7L);
        vet1.setFirstName("Vladimir");
        vet1.setLastName("Prutin");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(4L);
        vet2.setFirstName("Lady");
        vet2.setLastName("Gaga");

        vetService.save(vet2);

        System.out.println("Loaded vets....");
    }
}
