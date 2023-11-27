package org.example.common;

import org.example.common.MainCanvas;

import java.awt.*;

public interface CanvasRepaintListener
{
    void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime);
}
