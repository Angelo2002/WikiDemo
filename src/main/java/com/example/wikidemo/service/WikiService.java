package com.example.wikidemo.service;
import com.example.wikidemo.Entity.Breed;
import com.example.wikidemo.dto.BreedDTO;

import java.util.List;


public interface WikiService {
    BreedDTO getBreedById(Long id);
    BreedDTO getBreedByName(String name);
    void saveBreed(Breed breed);
    void deleteBreed(Long id);
    void updateBreed(Breed breed);

    List<BreedDTO> getAllBreeds();
}
