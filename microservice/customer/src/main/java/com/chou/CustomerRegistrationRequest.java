package com.chou;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
