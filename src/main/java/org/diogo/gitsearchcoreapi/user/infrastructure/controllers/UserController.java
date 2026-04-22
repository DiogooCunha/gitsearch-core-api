package org.diogo.gitsearchcoreapi.user.infrastructure.controllers;

import lombok.RequiredArgsConstructor;
import org.diogo.gitsearchcoreapi.user.application.usecases.GetCurrentUserUseCase;
import org.diogo.gitsearchcoreapi.user.domain.dtos.UserInfoResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user")
public class UserController {

    private final GetCurrentUserUseCase getCurrentUserUseCase;

    @GetMapping
    public ResponseEntity<UserInfoResponseDTO> find(@RequestHeader("token") final String token) {
        return ResponseEntity.ok(this.getCurrentUserUseCase.execute(token));
    }
}
