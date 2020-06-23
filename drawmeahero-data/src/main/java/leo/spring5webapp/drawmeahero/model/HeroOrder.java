package leo.spring5webapp.drawmeahero.model;

import lombok.Data;

import java.util.Set;

@Data
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

    private Set<Image> images;
}
