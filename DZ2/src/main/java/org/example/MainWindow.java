package org.example;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame
{
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private final  Sprite[] sprites = new Sprite[10];
    private final Interactable[] interactables = new Interactable[10];
    private final Backgraund[] backgrounds = new Backgraund[1]; // добавил фон


    public MainWindow()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Кружки");

//        for (int i = 0; i < sprites.length; i++)
            for (int i = 0; i < interactables.length; i++)
        {
//            sprites[i] = new Ball();
              interactables[i] = new Ball();
        }

        for (int i = 0; i < backgrounds.length; i++)  // добавил изменение фона
        {
            backgrounds[i] = new Backgraund();
        }

        /** передаём ссылку на экземпляр этого же окна холсту canvas **/
        MainCanvas canvas = new MainCanvas(this); // применяем указатель this на текущий объект
        add(canvas);



        setVisible(true);
    }

    /** описание реализации нашего приложения (бизнес логика) **/
    public void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime)
    {
        update(canvas, deltaTime);
        render(canvas, g);
    }

    /** обновлять или изменять состояние нашего приложения или объекта **/
    private void update(MainCanvas canvas, float deltaTime) // передаём сам холст и время между перерисовками объектов
    {
//        for (int i = 0; i < sprites.length; i++)
        for (int i = 0; i < interactables.length; i++)
        {
//            sprites[i].update(canvas, deltaTime);
            interactables[i].update(canvas, deltaTime);
        }

        for (int i = 0; i < backgrounds.length; i++) // добавил изменение фона
        {
            backgrounds[i].update(canvas, deltaTime);
        }
    }
    /** отдавать команды рисующим самих себя компонентам (перерисовывать объекты) **/
    private void render(MainCanvas canvas, Graphics g) // передаём сам объект и графику рисования объекта
    {
        // Очищаем предыдущие отрисованные объекты
//        g.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // Проходим по всем объектам и вызываем их методы отрисовки
//        for (int i = 0; i < sprites.length; i++)
            for (int i = 0; i < interactables.length; i++)
            {
//            sprites[i].render(canvas, g);
                interactables[i].render(canvas, g);
            }
        for (int i = 0; i < backgrounds.length; i++)  // доавил изменение фона
        {
            backgrounds[i].render(canvas, g);
        }
    }

}
