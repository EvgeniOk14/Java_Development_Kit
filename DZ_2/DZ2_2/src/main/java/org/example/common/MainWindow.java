package org.example.common;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class MainWindow extends JFrame implements CanvasRepaintListener {
    private Sprite[] sprites;
    private AbstrackBackground[] backgrounds;

    public MainWindow(String title, Sprite[] sprites, AbstrackBackground[] backgrounds) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 200, 800, 600);
        setTitle(title);

        this.sprites = sprites;
        this.backgrounds = backgrounds;

        MainCanvas canvas = new MainCanvas(this);
        add(canvas);
        setVisible(true);
    }

    @Override
    public void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(MainCanvas canvas, float deltaTime) {
        for (Interactable interactable : sprites) {
            interactable.update(canvas, deltaTime);
        }

        for (AbstrackBackground background : backgrounds) {
            background.update(canvas, deltaTime);
        }
    }

    private void render(MainCanvas canvas, Graphics g) {
        for (Interactable interactable : sprites) {
            interactable.render(canvas, g);
        }

        for (AbstrackBackground background : backgrounds) {
            background.render(canvas, g);
        }
    }
}