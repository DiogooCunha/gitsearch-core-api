package org.diogo.gitsearchcoreapi.user.domain.ports;


import org.diogo.gitsearchcoreapi.user.domain.dtos.UserInfoResponseDTO;

public interface IUserPort {
    UserInfoResponseDTO findCurrent(final String token);
}
