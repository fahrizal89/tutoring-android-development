package com.fahrizal.tutoringsoftwaredev.architecture;

import com.fahrizal.tutoringsoftwaredev.tutorial.AndroidTutorial;
import com.fahrizal.tutoringsoftwaredev.tutorial.CondimentDecorator;

public class Clean extends CondimentDecorator {

    private final AndroidTutorial androidTutorial;

    public Clean(AndroidTutorial androidTutorial) {
        this.androidTutorial = androidTutorial;
    }

    @Override
    public String getDescription() {
        return androidTutorial.getDescription() + " + Clean architecture";
    }

    @Override
    public double cost() {
        return 220_000 + androidTutorial.cost();
    }
}
