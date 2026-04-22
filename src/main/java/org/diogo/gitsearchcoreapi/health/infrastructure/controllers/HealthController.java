package org.diogo.gitsearchcoreapi.health.infrastructure.controllers;

import lombok.RequiredArgsConstructor;
import org.diogo.gitsearchcoreapi.health.application.usecases.CheckHealthUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/health")
public class HealthController {

    private final CheckHealthUseCase checkHealthUseCase;

    @GetMapping
    public ResponseEntity<String> check() {
        return ResponseEntity.ok(this.checkHealthUseCase.execute());
    }
}
