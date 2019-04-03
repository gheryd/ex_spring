package org.springframework.samples.petclinic.owner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetRestController {

    private final PetRepository pets;

    public PetRestController(PetRepository pets) {
        this.pets = pets;
    }

    @GetMapping("/getallpets")
    List<Pet> all() {
        return pets.findAll();
    }
}
