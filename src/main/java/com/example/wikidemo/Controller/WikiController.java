package com.example.wikidemo.Controller;
import com.example.wikidemo.Entity.Breed;
import com.example.wikidemo.dto.BreedDTO;
import com.example.wikidemo.service.WikiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class WikiController {


    private final WikiService wikiService;



    @QueryMapping
    public BreedDTO getBreedById(@Argument long id) {
        return wikiService.getBreedById(id);
    }


    @QueryMapping
    public List<BreedDTO> breeds() {
        return wikiService.getAllBreeds();
    }
}