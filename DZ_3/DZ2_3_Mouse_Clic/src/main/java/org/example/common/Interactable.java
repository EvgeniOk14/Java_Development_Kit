package org.example.common;

import java.awt.*;

public interface Interactable
{
    void update(MainCanvas canvas, float dataTime);
    void render(MainCanvas canvas, Graphics g);
}
