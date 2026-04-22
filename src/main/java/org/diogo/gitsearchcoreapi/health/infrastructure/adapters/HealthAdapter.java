package org.diogo.gitsearchcoreapi.health.infrastructure.adapters;

import org.diogo.gitsearchcoreapi.health.domain.ports.IHealthPort;
import org.springframework.stereotype.Component;

@Component
public class HealthAdapter implements IHealthPort {

    @Override
    public String checkHealth() {
        return "CHECK";
    }
}
