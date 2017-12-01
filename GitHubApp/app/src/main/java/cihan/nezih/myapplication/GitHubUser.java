package cihan.nezih.myapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nezih on 30-Nov-17.
 */

public class GitHubUser {

    @SerializedName("login")
    private String login;

    @SerializedName("name")
    private String name;

    @SerializedName("bio")
    private String bio;

    @SerializedName("public_repos")
    private String repoNum;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("followers")
    private String followers;

    @SerializedName("following")
    private String following;

    public GitHubUser(String bio,
                      String following,
                      String followers,
                      String name,
                      String login,
                      String repoNum,
                      String updatedAt,
                      String createdAt) {
        this.bio = bio;
        this.following = following;
        this.followers = followers;
        this.name = name;
        this.login = login;
        this.repoNum = repoNum;
        this.updatedAt = updatedAt;
        this.createdAt= createdAt;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    public String getRepoNum() {
        return repoNum;
    }

    public void setRepoNum(String repoNum) {
        this.repoNum = repoNum;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
