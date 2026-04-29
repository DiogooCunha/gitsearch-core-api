package org.diogo.gitsearchcoreapi.user.domain.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;
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

    private Integer id;

    @JsonProperty("node_id")
    private String nodeId;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("gravatar_id")
    private String gravatarId;

    private String url;

    @JsonProperty("html_url")
    private String htmlUrl;

    @JsonProperty("followers_url")
    private String followersUrl;

    @JsonProperty("following_url")
    private String followingUrl;

    @JsonProperty("gists_url")
    private String gistsUrl;

    @JsonProperty("starred_url")
    private String starredUrl;

    @JsonProperty("subscription_url")
    private String subscriptionUrl;

    private String type;

    @JsonProperty("site_admin")
    private Boolean siteAdmin;

    private String name;

    private String company;

    private String location;

    private String email;

    private String hireable;

    private String bio;

    @JsonProperty("public_repos")
    private Integer publicRepos;

    @JsonProperty("public_gists")
    private Integer publicGists;

    private Integer followers;

    private Integer following;

    @JsonProperty("private_gists")
    private Integer privateGists;

    @JsonProperty("total_private_repos")
    private Integer totalPrivateRepos;

    @JsonProperty("owned_private_repos")
    private Integer ownedPrivateRepos;
}
