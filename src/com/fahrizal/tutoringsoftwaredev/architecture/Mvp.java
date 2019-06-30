package com.fahrizal.tutoringsoftwaredev.architecture;

import com.fahrizal.tutoringsoftwaredev.tutorial.CondimentDecorator;
import com.fahrizal.tutoringsoftwaredev.tutorial.AndroidTutorial;

public class Mvp extends CondimentDecorator {

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
