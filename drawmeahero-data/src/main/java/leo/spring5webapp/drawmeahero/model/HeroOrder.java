package leo.spring5webapp.drawmeahero.model;

import java.util.List;

public class HeroOrder extends BaseEntity {

    private Requester requester;

    private boolean forRequester;

    private String requesteeName;

    private List<Like> likes;

    private List<Dislike> dislikes;

    private List<Quality> qualities;

    private List<Habit> habits;

    private List<FavoriteColor> favoriteColors;

    private boolean withNemesis;

    private boolean withOriginStory;

    private Hero hero;

    public Requester getRequester() {
        return requester;
    }

    public void setRequester(Requester requester) {
        this.requester = requester;
    }

    public boolean isForRequester() {
        return forRequester;
    }

    public void setForRequester(boolean forRequester) {
        this.forRequester = forRequester;
    }

    public String getRequesteeName() {
        return requesteeName;
    }

    public void setRequesteeName(String requesteeName) {
        this.requesteeName = requesteeName;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Dislike> getDislikes() {
        return dislikes;
    }

    public void setDislikes(List<Dislike> dislikes) {
        this.dislikes = dislikes;
    }

    public List<Quality> getQualities() {
        return qualities;
    }

    public void setQualities(List<Quality> qualities) {
        this.qualities = qualities;
    }

    public List<Habit> getHabits() {
        return habits;
    }

    public void setHabits(List<Habit> habits) {
        this.habits = habits;
    }

    public List<FavoriteColor> getFavoriteColors() {
        return favoriteColors;
    }

    public void setFavoriteColors(List<FavoriteColor> favoriteColors) {
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

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
