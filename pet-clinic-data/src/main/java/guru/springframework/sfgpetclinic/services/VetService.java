package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Veterinarian;

import java.util.Set;

public interface VetService {

    Veterinarian findById(Long id);

    Veterinarian save(Veterinarian pet);

    Set<Veterinarian> findAll();
}
