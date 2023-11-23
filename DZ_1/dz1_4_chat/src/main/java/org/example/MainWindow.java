package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame
{
    private static final int WINDOW_HEIGHT = 700;
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_POSX = 700;
    private static final int WINDOW_POSY = 200;
    private boolean isServerWorkind;

    MainWindow()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Окно управленя сервером");
        setResizable(false);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setAlignmentX(Component.CENTER_ALIGNMENT);

        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel1.setBackground(Color.cyan);

        JLabel server1 = new JLabel("Кнопка запуска сервера:");
        server1.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton buttonServer1 = new JButton("запуска сервера");
        buttonServer1.setAlignmentX(Component.CENTER_ALIGNMENT);

        buttonServer1.setPreferredSize(new Dimension(100, 50));
        buttonServer1.setBackground(Color.YELLOW);

        JLabel server2 = new JLabel("Кнопка выключения сервера:");
        server2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton buttonServer2 = new JButton("выключение сервера");
        buttonServer2.setAlignmentX(Component.CENTER_ALIGNMENT);


        buttonServer2.setPreferredSize(new Dimension(100, 50));
        buttonServer2.setBackground(Color.red);

        panel1.add(Box.createVerticalStrut(100)); // Промежуток в 20 пикселей
        panel1.add(server1, BorderLayout.CENTER);
        panel1.add(Box.createVerticalStrut(20)); // Промежуток в 20 пикселей
        panel1.add(buttonServer1, BorderLayout.CENTER);

        panel1.add(Box.createVerticalStrut(150)); // Промежуток в 150 пикселей

        panel1.add(separator);

        panel1.add(server2, BorderLayout.NORTH);
        panel1.add(Box.createVerticalStrut(20)); // Промежуток в 20 пикселей
        panel1.add(buttonServer2, BorderLayout.NORTH);

        panel1.add(Box.createVerticalStrut(150)); // Промежуток в 20 пикселей

        setLayout(new BorderLayout());

        add(panel1, BorderLayout.CENTER);

        buttonServer1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!isServerWorkind)
                {
                    isServerWorkind = true;
                }
                System.out.println("статус сервера: " + isServerWorkind);
            }
        });

        buttonServer2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isServerWorkind)
                {
                    isServerWorkind = false;
                }
                System.out.println("статус сервера: " + isServerWorkind);
            }
        });

        setVisible(true);
    }

}


