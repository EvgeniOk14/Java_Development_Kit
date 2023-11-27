package org.example.bricks;

import org.example.common.AbstrackBackground;
import org.example.common.Interactable;
import org.example.common.MainCanvas;

import java.awt.*;

public class BackGroundForBricks extends AbstrackBackground
{
    @Override
    public void update(MainCanvas canvas, float deltaTime)
    {
        time += deltaTime;
        int red = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 4f));
        int green = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 5f));
        int blue = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 2F));
        int yellow = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time *3f));
        color = new Color(red, green, blue, yellow);
    }

    @Override
    public void render(MainCanvas canvas, Graphics g)
    {
        canvas.setBackground(color);
    }
}
