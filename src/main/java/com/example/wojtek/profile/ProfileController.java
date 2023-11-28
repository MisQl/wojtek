package com.example.wojtek.profile;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/profiles")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping
    public Object getProfiles() {
        return profileService.getProfiles();
    }

    @GetMapping("{id}")
    public Object getProfile(@PathVariable UUID id) {
        return profileService.getProfile(id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void deleteProfile(@PathVariable UUID id) {
        profileService.deleteProfile(id);
    }
}
