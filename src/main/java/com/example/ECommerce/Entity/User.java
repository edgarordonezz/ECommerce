/*
Used NotBlank because NotNull allows empty strings
A user has a id(PK), username, password(need to hash)
 */

package com.example.ECommerce.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identifies the user
    private Long id;

    @NotBlank
    private String username;

    // TODO: Hash password for security purposes
    @NotBlank
    private String password;

    @NotBlank
    private String email;

    @NotBlank
    private String role;
}
