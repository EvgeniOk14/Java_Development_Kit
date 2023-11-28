package org.example;

import javax.swing.*;
import java.awt.*;

public class MainCanvas  extends JPanel
{
    private MainWindow controller;
    private long lastFrameTime; // текущее время

    /** Для того что бы каждый раз, при перерисовки,
     *  Класс MainCanvas вызывал (дёргал) метод onDrawFrame() из Класса Mainindow и чтобы изображение как-то менялось
     * т.е. canvas должен знать (чей метод она будет вызывать) на каком классе он находиться **/
    MainCanvas(MainWindow controller) // для этого в конструктор передаём MainWindow
    {

//        setBackground(Color.BLUE);
        this.controller = controller;
        lastFrameTime = System.nanoTime();  // ПРИСВАЕВАЕТ ТЕКУЩЕЕ ВРЕМЯ В НАНОСЕКУНДАХ (нужно для расчёта времени между кадрами)
    }

    /** Нужен для перерисовки панели!!!
     * Вызываеться тогда, когда фреймворку "Swing" необходимо перерисовать панель **/
    @Override
    protected void paintComponent(Graphics g) // цикл по типу: ( do { )
    {
        super.paintComponent(g);              // что-то
        float deltaTime = (System.nanoTime() - lastFrameTime) * 0.000000001f; // вычисление разницы времени между кадрами (отрисовкой кадров)
        controller.onDrawFrame(this, g, deltaTime);                // вызываем метод для перересовки (делаем какое-либо полезное действие)
        lastFrameTime = System.nanoTime();
        try {
            Thread.sleep(16);            // 16 милисекунд сон потока
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        repaint();                            // зацикливает процесс перерисовки холста (по типу  } while(true))
    }

    public int getLeft()
    {
        return 0;
    }
    public int getRight()
    {
        return getWidth() - 1;
    }
    public int getTop()
    {
        return 0;
    }
    public int getBottom()
    {
        return getHeight() - 1;
    }

}
