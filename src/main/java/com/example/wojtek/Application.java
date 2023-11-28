package com.example.wojtek;

import com.example.wojtek.profile.Car;
import com.example.wojtek.profile.CarRepository;
import com.example.wojtek.profile.Profile;
import com.example.wojtek.profile.ProfileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(ProfileRepository profileRepository, CarRepository carRepository) {
        return args -> {
            profileRepository.deleteAll();
            profileRepository.save(new Profile(null, "Wojtek", null, null));
            profileRepository.save(new Profile(null, "Bartek", null, null));

            carRepository.deleteAll();
            carRepository.save(new Car(null, "BMW", null, null));
            carRepository.save(new Car(null, "Audi", null, null));
        };
    }
}
