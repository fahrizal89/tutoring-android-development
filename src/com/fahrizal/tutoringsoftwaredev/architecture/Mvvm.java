package com.fahrizal.tutoringsoftwaredev.architecture;

import com.fahrizal.tutoringsoftwaredev.tutorial.CondimentDecorator;
import com.fahrizal.tutoringsoftwaredev.tutorial.AndroidTutorial;

public class Mvvm extends CondimentDecorator {

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
