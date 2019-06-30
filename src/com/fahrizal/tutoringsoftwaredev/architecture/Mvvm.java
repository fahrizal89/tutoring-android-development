package com.fahrizal.tutoringsoftwaredev.architecture;

import com.fahrizal.tutoringsoftwaredev.tutorial.LanguageDecorator;
import com.fahrizal.tutoringsoftwaredev.tutorial.AndroidTutorial;

public class Mvvm extends LanguageDecorator {

    private final AndroidTutorial androidTutorial;

    public Mvvm(AndroidTutorial androidTutorial) {
        this.androidTutorial = androidTutorial;
    }

    @Override
    public String getDescription() {
        return androidTutorial.getDescription()+" + MVVM";
    }

    @Override
    public double cost() {
        return 100_000 + androidTutorial.cost();
    }
}
