package org.diogo.gitsearchcoreapi.auth.infrastructure.controllers;

import lombok.RequiredArgsConstructor;
import org.diogo.gitsearchcoreapi.auth.application.usecases.ExchangeCodeUseCase;
import org.diogo.gitsearchcoreapi.auth.domain.dtos.GithubCredentialsDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/auth")
public class AuthController {

    private final ExchangeCodeUseCase exchangeCodeUseCase;

    @PostMapping(value = "/github")
    public ResponseEntity<GithubCredentialsDTO> exchange(@RequestParam("code") final String code) {
        return ResponseEntity.ok(this.exchangeCodeUseCase.execute(code));
    }
}
