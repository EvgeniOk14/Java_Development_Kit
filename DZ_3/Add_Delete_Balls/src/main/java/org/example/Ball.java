package org.example;

import java.awt.*;
import java.util.Random;

public class Ball
{
    private static Random rnd = new Random();
    private Color color;
    private float vX;
    private float vY;
    private int x;
    private int y;
    private float diameter;

    //region Setter and Getter
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getvX() {
        return vX;
    }

    public void setvX(float vX) {
        this.vX = vX;
    }

    public float getvY() {
        return vY;
    }

    public void setvY(float vY) {
        this.vY = vY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
    // endregion
    public Ball(int x, int y, float diameter, float vX, float vY, Color color) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.vX = vX;
        this.vY = vY;
        this.color = color;
    }

    public void render(MainCanvas canvas, Graphics g) {
        g.setColor(color);
        int diameter = (int) this.diameter;
        g.fillOval((int) (x - diameter / 2), (int) (y - diameter / 2), diameter, diameter);
    }
}
