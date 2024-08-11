package com.example.wikidemo.service;
import com.example.wikidemo.Entity.Breed;
public interface WikiService {
    Breed getBreedById(Long id);
    Breed getBreedByName(String name);
    void saveBreed(Breed breed);
    void deleteBreed(Long id);
    void updateBreed(Breed breed);
}
