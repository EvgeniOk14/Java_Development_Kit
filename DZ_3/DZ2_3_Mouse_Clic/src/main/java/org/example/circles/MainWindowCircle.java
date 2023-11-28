package org.example.circles;

import org.example.common.*;

public class MainWindowCircle extends MainWindow
{
    public MainWindowCircle()
    {
        super("Кружки", createCircles(), createBackgrounds());
    }

    private static Sprite[] createCircles() {
        Sprite[] circles = new Ball[10];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Ball();
        }
        return circles;
    }

    private static AbstrackBackground[] createBackgrounds()
    {
        return new AbstrackBackground[]{new BackgroundForCircles()
        {

        }};
    }

}
