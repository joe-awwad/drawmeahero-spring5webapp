package leo.spring5webapp.drawmeahero.model;

import lombok.Data;

import java.util.Set;

@Data
public class Hero extends BaseEntity {

    private String name;

    private Set<String> superpowers;

    private Set<String> weaknesses;

    private SideKick sideKick;

    private Hero nemesis;
}
