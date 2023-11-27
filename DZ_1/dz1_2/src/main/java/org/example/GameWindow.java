package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_POSX = 700;
    private static final int WINDOW_POSY = 300;
    Map map;
    SettingsWindow settings;
    JButton btnStart = new JButton("New Game");
    JButton btrEnd  = new JButton("Exit");
    GameWindow()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE); // метод, который устанавливает операцию закрытия окна при закрытии его пользователем
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("TicTacToy");
        setResizable(false);

        JPanel pannelButton = new JPanel(new GridLayout(1,2));
        pannelButton.add(btnStart);
        pannelButton.add(btrEnd);
        add(pannelButton, BorderLayout.SOUTH);
        map = new Map();
        add(map);
        setVisible(true);



        settings = new SettingsWindow(this);

        btrEnd.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        btnStart.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                settings.setVisible(true);
            }
        });
        settings.setVisible(true);

    }
}

