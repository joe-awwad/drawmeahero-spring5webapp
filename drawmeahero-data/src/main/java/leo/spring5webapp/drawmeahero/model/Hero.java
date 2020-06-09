package leo.spring5webapp.drawmeahero.model;

import java.util.Set;

public class Hero extends BaseEntity {

    private String name;

    private Set<Superpower> superpowers;

    private Set<Weakness> weaknesses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Superpower> getSuperpowers() {
        return superpowers;
    }

    public void setSuperpowers(Set<Superpower> superpowers) {
        this.superpowers = superpowers;
    }

    public Set<Weakness> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(Set<Weakness> weaknesses) {
        this.weaknesses = weaknesses;
    }
}
