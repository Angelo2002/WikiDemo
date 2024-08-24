package com.example.wikidemo.Controller;

import com.example.wikidemo.dto.BreedDTO;
import com.example.wikidemo.service.JwtService;
import com.example.wikidemo.service.UserInfoService;
import com.example.wikidemo.service.WikiService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class WikiController {

    private final WikiService wikiService;

    private final UserInfoService service;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    @QueryMapping

    public BreedDTO getBreedById(@Argument long id) {
        System.out.println("getBreedById: " + id);
        return wikiService.getBreedById(id);
    }


    @QueryMapping
    @PreAuthorize("isAuthenticated()")
    public List<BreedDTO> breeds() {
        return wikiService.getAllBreeds();
    }


    @MutationMapping
    public AuthPayload login(@Argument String username, @Argument String password) {
        // For testing purposes, we'll consider any login attempt as successful
        System.out.println("Test login: " + username);

        // Generate a token for any username
        String token = jwtService.generateToken(username);

        // Return a successful auth payload
        return new AuthPayload(token, username);
    }
}

@Getter
class AuthPayload {
    private final String token;
    private final String username;

    public AuthPayload(String token, String username) {
        this.token = token;
        this.username = username;
    }

}
