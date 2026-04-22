package org.diogo.gitsearchcoreapi.user.infrastructure.adapters;

import java.util.Map;
import org.diogo.gitsearchcoreapi.user.domain.dtos.UserInfoResponseDTO;
import org.diogo.gitsearchcoreapi.user.domain.ports.IUserPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class UserAdapter implements IUserPort {

    @Override
    public UserInfoResponseDTO findCurrent(final String token) {
        return restClient.get()
            .uri("/user")
            .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
            .retrieve()
            .body(UserInfoResponseDTO.class);
    }

    private final RestClient restClient = RestClient.builder()
        .baseUrl("https://api.github.com")
        .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
        .build();
}
