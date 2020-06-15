package leo.spring5webapp.drawmeahero.model;

import java.util.Set;

public class Hero extends BaseEntity {

    private String name;

    private Set<String> superpowers;

    private Set<String> weaknesses;

    private SideKick sideKick;

    private Hero nemesis;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSuperpowers() {
        return superpowers;
    }

    public void setSuperpowers(Set<String> superpowers) {
        this.superpowers = superpowers;
    }

    public Set<String> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(Set<String> weaknesses) {
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
