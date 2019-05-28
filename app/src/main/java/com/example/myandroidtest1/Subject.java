package com.example.myandroidtest1;

import java.io.Serializable;

public class Subject implements Serializable {
    private String name;
    private String content;
    private int brain;
    private int quality;
    private int ability;

    public Subject(String name, String content, int brain, int quality, int ability) {
        this.name = name;
        this.content = content;
        this.brain = brain;
        this.quality = quality;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }
}
