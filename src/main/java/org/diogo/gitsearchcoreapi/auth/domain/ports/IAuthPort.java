package org.diogo.gitsearchcoreapi.auth.domain.ports;

import org.diogo.gitsearchcoreapi.auth.domain.dtos.GithubCredentialsDTO;

public interface IAuthPort {
    GithubCredentialsDTO exchangeCode(final String code);
}
