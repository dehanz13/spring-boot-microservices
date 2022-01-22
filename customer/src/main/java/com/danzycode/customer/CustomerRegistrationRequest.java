package com.danzycode.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
