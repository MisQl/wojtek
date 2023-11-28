package com.example.wojtek.profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, UUID> {

//    @Query("select p from Profile p left join fetch p.car")
//    List<Profile> findAll();

    @Modifying
    @Query("delete Profile p where p.id = :id")
    void deleteById(UUID id);
}
