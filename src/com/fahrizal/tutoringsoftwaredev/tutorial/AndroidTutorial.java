package com.fahrizal.tutoringsoftwaredev.tutorial;

public abstract class AndroidTutorial {

    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription(){
        return "Android "+ description;
    }

    public abstract double cost();
}
