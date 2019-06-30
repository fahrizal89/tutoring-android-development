# Decorator Pattern
*The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality*

This application for tutoring android development who implement decorator pattern.
We will create:

1. Application for get cost if join tutoring development
2. Tutoring development have 2 programming languages: Java, Kotlin
3. Tutoring development have 3 variant architectures: MVP, MVVM, Clean

# Let's start!

1. Create class AndroidTutorial (abstract class)
This class is basic class for variant of tutoring: get description and costing.
```
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
```

2. Create decorator class
```
public abstract class LanguageDecorator extends AndroidTutorial {
    public abstract String getDescription();
}
```

3. Create class of language variants
```
public class Java extends AndroidTutorial {

    public Java() {
        setDescription("Java");
    }

    @Override
    public double cost() {
        return 400_000;
    }
}
```
```
public class Kotlin extends AndroidTutorial {

    public Kotlin() {
        setDescription("Kotlin");
    }

    @Override
    public double cost() {
        return 500_000;
    }
}
```
Both of class extends AndroidTutorial because need enitity description and method cost() for calculate cost.

4. Create class variant of architectures 
```
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
```
```
public class Clean extends LanguageDecorator {

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
```

# Run it!
Now it's time to run this code and also create variants tutoring android.
```
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
```

# Output
```
Android Kotlin Rp.500000.0
Android Java Rp.400000.0
Android Java + MVP Rp.550000.0
Android Java + MVP + Clean architecture Rp.770000.0
```
