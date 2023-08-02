package com.yassine.microservices.customer;

public record CustomerRegistrationRequest(String firstName,
                                          String lastName,
                                          String email) {

}
