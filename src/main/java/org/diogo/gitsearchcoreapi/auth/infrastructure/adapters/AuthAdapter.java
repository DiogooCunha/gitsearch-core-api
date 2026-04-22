package org.diogo.gitsearchcoreapi.auth.infrastructure.adapters;

import java.util.Map;
import org.diogo.gitsearchcoreapi.auth.domain.dtos.GithubCredentialsDTO;
import org.diogo.gitsearchcoreapi.auth.domain.ports.IAuthPort;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class AuthAdapter implements IAuthPort {

    @Value("${github.client-id}")
    private String clientId;

    @Value("${github.client-secret}")
    private String clientSecret;

    @Override
    public GithubCredentialsDTO exchangeCode(String code) {
        return restClient.post()
            .uri("/login/oauth/access_token")
            .body(Map.of(
                "client_id", clientId,
                "client_secret", clientSecret,
                "code", code
            ))
            .retrieve()
            .body(GithubCredentialsDTO.class);
    }

    private final RestClient restClient = RestClient.builder()
        .baseUrl("https://github.com")
        .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
        .build();

}
