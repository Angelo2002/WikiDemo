package com.example.wikidemo.service;

import com.example.wikidemo.Entity.Breed;
import com.example.wikidemo.dto.BreedDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WikiServiceMock implements WikiService {

        @Override
        public BreedDTO getBreedById(Long id) {
            return BreedDTO.builder().id(1L).name("Breed1").description("Got by ID").build();
        }



        @Override
        public BreedDTO getBreedByName(String name) {
            return BreedDTO.builder().id(2L).name("Breed2").description("Got by name").build();
        }

        @Override
        public void saveBreed(Breed breed) {
            return;
        }

        @Override
        public void deleteBreed(Long id) {
            return;
        }

        @Override
        public void updateBreed(Breed breed) {
            return;
        }

    @Override
    public List<BreedDTO> getAllBreeds() {
        return List.of(
                BreedDTO.builder().id(1L).name("BreedA").description("Got by list").build(),
                BreedDTO.builder().id(2L).name("BreedB").description("Got by list").build()
        );
    }

}
