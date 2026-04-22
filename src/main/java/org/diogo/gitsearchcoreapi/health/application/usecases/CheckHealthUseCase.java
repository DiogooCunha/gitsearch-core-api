package org.diogo.gitsearchcoreapi.health.application.usecases;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.diogo.gitsearchcoreapi.health.domain.ports.IHealthPort;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CheckHealthUseCase {

    private final IHealthPort healthPort;

    public String execute() {
        log.info("[m=execute] Check application health");
        return this.healthPort.checkHealth();
    }

}
