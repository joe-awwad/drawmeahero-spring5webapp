package leo.spring5webapp.drawmeahero.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DmahRequest {

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private String email;

    private boolean forRequester;

    private String requesteeName;

    private List<String> likes = new ArrayList<>();

    private List<String> dislikes = new ArrayList<>();

    private List<String> qualities = new ArrayList<>();

    private List<String> habits = new ArrayList<>();

    private List<String> favoriteColors = new ArrayList<>();

    private boolean withNemesis;

    private boolean withOriginStory;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isForRequester() {
        return forRequester;
    }

    public void setForRequester(boolean forRequester) {
        this.forRequester = forRequester;
    }

    public String getRequesteeName() {
        if (forRequester) {
            requesteeName = this.firstName + ' ' + this.lastName;
        }
        return requesteeName;
    }

    public void setRequesteeName(String requesteeName) {
        this.requesteeName = requesteeName;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    public List<String> getDislikes() {
        return dislikes;
    }

    public void setDislikes(List<String> dislikes) {
        this.dislikes = dislikes;
    }

    public List<String> getQualities() {
        return qualities;
    }

    public void setQualities(List<String> qualities) {
        this.qualities = qualities;
    }

    public List<String> getHabits() {
        return habits;
    }

    public void setHabits(List<String> habits) {
        this.habits = habits;
    }

    public List<String> getFavoriteColors() {
        return favoriteColors;
    }

    public void setFavoriteColors(List<String> favoriteColors) {
        this.favoriteColors = favoriteColors;
    }

    public boolean isWithNemesis() {
        return withNemesis;
    }

    public void setWithNemesis(boolean withNemesis) {
        this.withNemesis = withNemesis;
    }

    public boolean isWithOriginStory() {
        return withOriginStory;
    }

    public void setWithOriginStory(boolean withOriginStory) {
        this.withOriginStory = withOriginStory;
    }

}
