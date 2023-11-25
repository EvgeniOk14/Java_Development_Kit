package org.example;

import java.awt.*;

public interface CanvasRepaintListener
{
    void onDrawFrame(MainCanvas canvas, Graphics g, long dataTime);
}
