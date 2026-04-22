package org.diogo.gitsearchcoreapi.user.application.usecases;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.diogo.gitsearchcoreapi.user.domain.dtos.UserInfoResponseDTO;
import org.diogo.gitsearchcoreapi.user.domain.ports.IUserPort;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GetCurrentUserUseCase {

    private final IUserPort userPort;

    public UserInfoResponseDTO execute(final String token) {
        log.info("[m=execute] Getting user information");
        return this.userPort.findCurrent(token);
    }
}
