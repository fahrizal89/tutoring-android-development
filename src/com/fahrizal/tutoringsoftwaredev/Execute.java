package com.fahrizal.tutoringsoftwaredev;

import com.fahrizal.tutoringsoftwaredev.architecture.Clean;
import com.fahrizal.tutoringsoftwaredev.architecture.Mvp;
import com.fahrizal.tutoringsoftwaredev.tutorial.Java;
import com.fahrizal.tutoringsoftwaredev.tutorial.AndroidTutorial;
import com.fahrizal.tutoringsoftwaredev.tutorial.Kotlin;

public class Execute {

    public static void main(String[] args){
        AndroidTutorial androidKotlinTutorial = new Kotlin();
        System.out.println(androidKotlinTutorial.getDescription() +" Rp."+ androidKotlinTutorial.cost());

        AndroidTutorial androidJavaTutorial = new Java();
        System.out.println(androidJavaTutorial.getDescription() +" Rp."+ androidJavaTutorial.cost());

        androidJavaTutorial = new Mvp(androidJavaTutorial);
        System.out.println(androidJavaTutorial.getDescription() +" Rp."+ androidJavaTutorial.cost());

        androidJavaTutorial = new Clean(androidJavaTutorial);
        System.out.println(androidJavaTutorial.getDescription() +" Rp."+ androidJavaTutorial.cost());
    }
}
