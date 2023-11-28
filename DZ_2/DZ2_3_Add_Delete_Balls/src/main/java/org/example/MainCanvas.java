package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainCanvas extends JPanel
{
    private final Ball[] balls = new Ball[10];
    private int ballCount = 0;

    public MainCanvas()
    {
        setBackground(Color.LIGHT_GRAY);


             addMouseListener(new MouseAdapter()
             {
                 @Override
                 public void mouseClicked(MouseEvent e)
                 {
                     super.mouseClicked(e);
                     if (SwingUtilities.isLeftMouseButton(e))
                     try {
                         if(ballCount < 10)
                         {
                             createNewBall(e.getX(), e.getY());
                             repaint();
                         }
                     else
                         {
                             throw new ArrayIndexOutOfBoundsException("Превышения массива шаров! ");
                         }
                     }
                     catch (ArrayIndexOutOfBoundsException exception)
                     {
                         JOptionPane.showMessageDialog(null, exception.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
                     }

                 }

            });

        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
               if(SwingUtilities.isRightMouseButton(e) && ballCount > 0)
               {
                   deleteBall(e.getX(), e.getY());
                   repaint();
               }
            }
        });
    }

    public void deleteBall(int x, int y)
    {
        for (int i = 0; i < ballCount ; i++)
        {
            Ball ball= balls[i];
            if(isPointedBall(x, y, ball))
            {
                removeBallAtIndex(i);
                break;
            }
        }
    }

    public boolean isPointedBall(int x, int y, Ball ball)
    {
        int distanceSquared = (x - ball.getX()) * (x - ball.getX()) + (y - ball.getY()) * (y - ball.getY());
        return distanceSquared <= (ball.getDiameter() / 2) * (ball.getDiameter() / 2);
    }

    public  void removeBallAtIndex(int index)
    {
        // Сдвигаем все элементы после удаляемого на одну позицию влево
        for (int i = index; i < ballCount - 1; i++) {
            balls[i] = balls[i + 1];
        }
        // Уменьшаем счетчик шаров
        ballCount--;
    }

    public void createNewBall(int x, int y) {
        float randomDiameter = 20 + (float) (Math.random() * 30);
        float randomVX = 50 + (float) (Math.random() * 100);
        float randomVY = 50 + (float) (Math.random() * 100);
        Color randomColor = getRandomColor();

        Ball newBall = new Ball(x, y, randomDiameter, randomVX, randomVY, randomColor);
        balls[ballCount++] = newBall;
    }

    private Color getRandomColor() {
        return new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i =0; i < ballCount; i++) {
            balls[i].render(this, g);
        }
    }
}
