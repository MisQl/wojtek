package com.example.wojtek.profile;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;

    public List<Profile> getProfiles() {
        return profileRepository.findAll();
    }

    public Profile getProfile(UUID id) {
        return profileRepository.findById(id).orElseThrow();
    }

    @Transactional
    public void deleteProfile(UUID id) {
        profileRepository.deleteById(id);
    }
}
