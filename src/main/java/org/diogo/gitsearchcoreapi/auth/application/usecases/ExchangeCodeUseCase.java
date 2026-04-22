package org.diogo.gitsearchcoreapi.auth.application.usecases;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.diogo.gitsearchcoreapi.auth.domain.dtos.GithubCredentialsDTO;
import org.diogo.gitsearchcoreapi.auth.domain.ports.IAuthPort;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExchangeCodeUseCase {

    private final IAuthPort authPort;

    public GithubCredentialsDTO execute(final String code) {
        log.info("[m=execute] Exchanging code {} for access_token", code);
        return this.authPort.exchangeCode(code);
    }

}
