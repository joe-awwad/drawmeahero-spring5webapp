package leo.spring5webapp.drawmeahero.model;

import java.util.List;

public class Person extends BaseEntity {

    private Hero alterEgo;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private List<Like> likes;

    private List<Dislike> dislikes;

    private List<Quality> qualities;

    private List<Habit> habits;

    private List<FavoriteColor> favoriteColors;
}
