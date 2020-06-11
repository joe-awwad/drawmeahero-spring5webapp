package leo.spring5webapp.drawmeahero.model;

import java.util.Set;

public class Hero extends BaseEntity {

    private String name;

    private Set<Superpower> superpowers;

    private Set<Weakness> weaknesses;

    private SideKick sideKick;

    private Hero nemesis;

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

    public SideKick getSideKick() {
        return sideKick;
    }

    public void setSideKick(SideKick sideKick) {
        this.sideKick = sideKick;
    }

    public Hero getNemesis() {
        return nemesis;
    }

    public void setNemesis(Hero nemesis) {
        this.nemesis = nemesis;
    }
}
