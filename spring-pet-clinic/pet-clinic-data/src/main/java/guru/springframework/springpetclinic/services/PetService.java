package guru.springframework.springpetclinic.services;

import guru.springframework.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findbyID(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
