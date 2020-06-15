package leo.spring5webapp.drawmeahero.model;

import java.util.Set;

public class HeroOrder extends BaseEntity {

    private Requester requester;

    private boolean forRequester;

    private String requesteeName;

    private Set<String> likes;

    private Set<String> dislikes;

    private Set<String> qualities;

    private Set<String> habits;

    private Set<String> favoriteColors;

    private HeroFeatures features;

    private Set<String> products;

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

    public Set<String> getLikes() {
        return likes;
    }

    public void setLikes(Set<String> likes) {
        this.likes = likes;
    }

    public Set<String> getDislikes() {
        return dislikes;
    }

    public void setDislikes(Set<String> dislikes) {
        this.dislikes = dislikes;
    }

    public Set<String> getQualities() {
        return qualities;
    }

    public void setQualities(Set<String> qualities) {
        this.qualities = qualities;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    public Set<String> getFavoriteColors() {
        return favoriteColors;
    }

    public void setFavoriteColors(Set<String> favoriteColors) {
        this.favoriteColors = favoriteColors;
    }

    public HeroFeatures getFeatures() {
        return features;
    }

    public void setFeatures(HeroFeatures features) {
        this.features = features;
    }

    public Set<String> getProducts() {
        return products;
    }

    public void setProducts(Set<String> products) {
        this.products = products;
    }
}
