package org.diogo.gitsearchcoreapi.user.domain.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoResponseDTO {

    private String login;

    @JsonProperty("avatar_url")
    private String avatarUrl;

}
