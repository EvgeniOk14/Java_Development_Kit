package org.example.circles;

import org.example.common.Interactable;
import org.example.common.MainCanvas;
import org.example.common.Sprite;

import java.awt.*;
import java.util.Random;

public class Ball extends Sprite
{
    private static Random rnd  = new Random();
    private Color color;
    private float vX;
    private float vY;

    Ball()
    {
        halfHeight = 20 + (float) (Math.random() *50f); // определяет половину высоты объекта
        color = new Color(rnd.nextInt()); // выбирает случайный цвет

        vX = generateRandomSpeed(); // определения скорости (по горизонтали) объекта от 100 до 300
        vY = generateRandomSpeed(); // определения скорости (по вертикали) объекта от 100 до 300
    }

    private float generateRandomSpeed()  // добавил метод хаотичного движения мячей
    {
        return 100f + (float) (Math.random() * 200f); // определения скорости объекта от 100 до 300
    }

    @Override
    public void render(MainCanvas canvas, Graphics g)
    {
        g.setColor(color);
        int diameter = (int) getHeight(); // Используем высоту как диаметр мячи рисуються в разных точках
        g.fillOval((int) (x - halfWidth), (int) (y - halfHeight), diameter, diameter);
    }

    @Override
    public void update(MainCanvas canvas, float deltaTime)
    {
        x += vX * deltaTime;
        y += vY * deltaTime;

        if(getLeft() < canvas.getLeft())
        {
            setLeft(canvas.getLeft());
            vX = - vX;
        }
        if(getRigt() > canvas.getRight())
        {
            setRight(canvas.getRight());
            vX = - vX;
        }
        if(getTop() < canvas.getTop())
        {
            setTop(canvas.getTop());
            vY = - vY;
        }
        if(getBottom() > canvas.getBottom())
        {
            setBottom(canvas.getBottom());
            vY = - vY;
        }

    }
}
