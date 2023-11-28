package com.example.wojtek.profile;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Car {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    @CreatedDate
    private Instant createdAt;
    @OneToOne(fetch = FetchType.LAZY)
    private Profile profile;
}
