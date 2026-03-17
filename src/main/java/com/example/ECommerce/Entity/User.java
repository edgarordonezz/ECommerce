/*
Used NotBlank because NotNull allows empty strings
A user has a id(PK), username, password(need to hash)
 */

package com.example.ECommerce.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identifies the user
    private Long id;

    @NotBlank
    @Column(unique = true)
    private String username;

    // TODO: Hash password for security purposes
    @NotBlank
    private String password;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @NotBlank
    @Enumerated(EnumType.STRING)
    private String role;
}
