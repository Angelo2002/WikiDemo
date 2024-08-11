package com.example.wikidemo.service;

import com.example.wikidemo.Entity.Breed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
public class WikiServiceMock implements WikiService {

        @Override
        public Breed getBreedById(Long id) {
            return Breed.builder().id(1L).name("Breed1").description("Got by ID").build();
        }



        @Override
        public Breed getBreedByName(String name) {
            return Breed.builder().id(2L).name("Breed2").description("Got by name").build();
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

}
