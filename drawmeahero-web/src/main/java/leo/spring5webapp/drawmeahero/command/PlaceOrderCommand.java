package leo.spring5webapp.drawmeahero.command;

import leo.spring5webapp.drawmeahero.model.HeroFeatures;
import leo.spring5webapp.drawmeahero.model.Requester;
import lombok.Data;

import java.util.Set;

@Data
public class PlaceOrderCommand {

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

    private Set<ImageCommand> images;
}
