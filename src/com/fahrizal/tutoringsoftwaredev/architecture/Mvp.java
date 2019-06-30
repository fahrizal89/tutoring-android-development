package com.fahrizal.tutoringsoftwaredev.architecture;

import com.fahrizal.tutoringsoftwaredev.tutorial.LanguageDecorator;
import com.fahrizal.tutoringsoftwaredev.tutorial.AndroidTutorial;

public class Mvp extends LanguageDecorator {

    private final AndroidTutorial androidTutorial;

    public Mvp(AndroidTutorial androidTutorial) {
        this.androidTutorial = androidTutorial;
    }

    @Override
    public String getDescription() {
        return androidTutorial.getDescription()+" + MVP";
    }

    @Override
    public double cost() {
        return 150_000 + androidTutorial.cost();
    }
}
