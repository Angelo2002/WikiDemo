package com.example.wikidemo.service;
import com.example.wikidemo.Entity.Breed;

import java.util.List;

public interface WikiService {
    Breed getBreedById(Long id);
    Breed getBreedByName(String name);
    void saveBreed(Breed breed);
    void deleteBreed(Long id);
    void updateBreed(Breed breed);

    List<Breed> getAllBreeds();
}
