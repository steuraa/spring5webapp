package com.steuraa.inittrackerjava.core.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name="heroes")
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;
    private String avatar;
    private String player;
    @NotNull
    private String creature_class;
    @NotNull
    private String description;
    @NotNull
    private Integer hp;
    @NotNull
    private Integer ac;
    @NotNull
    private Integer init_mod;
    private String[] abilities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getCreature_class() {
        return creature_class;
    }

    public void setCreature_class(String creature_class) {
        this.creature_class = creature_class;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAc() {
        return ac;
    }

    public void setAc(Integer ac) {
        this.ac = ac;
    }

    public Integer getInit_mod() {
        return init_mod;
    }

    public void setInit_mod(Integer init_mod) {
        this.init_mod = init_mod;
    }

    public String[] getAbilities() {
        return abilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return id.equals(hero.id) &&
                name.equals(hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
