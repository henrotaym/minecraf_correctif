package models;

public class Player {
    private String name;
    private Integer health;

    public Player(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public Integer getHealth() {
        return this.health;
    }
}
