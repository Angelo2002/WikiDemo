package com.example.wikidemo.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.example.wikidemo.Entity.Breed;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BreedDTO {
    private Long id;
    private String name;
    private String origin;
    private String temperament;
    private String description;
    public BreedDTO(Breed breed) {
        this.id = breed.getId();
        this.name = breed.getName();
        this.description = breed.getDescription();
    }
}
