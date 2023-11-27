package org.example;

import javax.swing.*;

public class MainWindow extends JFrame
{
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 800;
    JPanel penal =  new MainCanvas();

    public MainWindow()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Добавь / удали шарик ");
        add(penal);
        setVisible(true);

    }
}
