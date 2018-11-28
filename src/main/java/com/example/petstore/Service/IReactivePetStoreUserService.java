package com.example.petstore.Service;

import com.example.petstore.model.PetStoreUser;
import org.springframework.lang.NonNull;
import reactor.core.publisher.Mono;

public interface IReactivePetStoreUserService {

    Mono<Void> registerNewUser(@NonNull PetStoreUser petStoreUser);
}
