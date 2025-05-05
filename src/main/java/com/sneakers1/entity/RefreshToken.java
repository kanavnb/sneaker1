package com.sneakers1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class RefreshToken {
    @Id
    @GeneratedValue
    private Long id;
    private String token;
    private LocalDateTime expiryDate;

    @ManyToOne
    private User user;
}
