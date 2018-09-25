package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Veternarian;

import java.util.Set;

public interface VetService {

    Veternarian findById(Long id);

    Veternarian save(Veternarian pet);

    Set<Veternarian> findAll();
}
