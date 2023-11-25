package org.example;

import java.awt.*;

/** данный класс описывает общее для всех объектов поведение **/
public abstract class Sprite implements Interactable
{

    protected float x;
    protected float y;
    protected float halfWidth;
    protected float halfHeight;

    /** Установка и получение всех границ объекта **/
    //region borders
    protected float getLeft() // получение левой границы объекта
    {
        return x - halfWidth;
    }
    protected void setLeft(float left) // установка левой границы объекта
    {
        x = left + halfWidth;
    }
    protected  float getRigt() // получение правой границы объекта
    {
        return x + halfWidth;
    }
    protected void setRight(float right) // установка правой границы объекта
    {
        x = right - halfWidth;
    }

    protected float getTop() // получение верхней границы объекта
    {
        return y - halfHeight;
    }
    protected void setTop(float top) // установка верхней границы объекта
    {
        y = top +halfHeight;
    }

    protected float getBottom() // получение нижней границы объекта
    {
        return y + halfHeight;
    }
    protected void setBottom(float bottom) // установка нижней границы объекта
    {
        y = bottom - halfHeight;
    }
    //endregion


    protected  float getWidth()
    {
        return 2f * halfWidth;
    }
    protected float getHeight()
    {
        return 2f * halfHeight;
    }

    @Override
    public void update(MainCanvas canvas, float deltaTime)
    {

    }
    @Override
    public void render(MainCanvas canvas, Graphics g)
    {

    }

}
