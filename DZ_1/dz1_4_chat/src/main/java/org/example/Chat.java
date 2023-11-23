package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Chat extends JFrame
{
    private static final int WINDOW_HEIGHT = 700;
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_POSX = 700;
    private static final int WINDOW_POSY = 200;
    String login;
    String password;
    String IP;
    String message;

    Chat() throws IOException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Окно ЧАТ");
        setResizable(true);

        JPanel clientPanel = new JPanel(new GridLayout(5, 2));
        clientPanel.setBackground(Color.green);

        JLabel loginLabel = new JLabel("Ведите логин: ");
        JTextField loginField = new JTextField();
        loginField.setPreferredSize(new Dimension(5, 20));
        loginField.setBackground(Color.LIGHT_GRAY);


        JLabel passwordLable = new JLabel("Введите пароль: ");
        JTextField passwordField = new JTextField();
        passwordField.setPreferredSize(new Dimension(5, 20));
        passwordField.setBackground(Color.LIGHT_GRAY);

        JLabel idLable = new JLabel("Введите id: ");
        JTextField idField = new JTextField();
        idField.setPreferredSize(new Dimension(5, 20));
        idField.setBackground(Color.LIGHT_GRAY);


        clientPanel.add(loginLabel);
        clientPanel.add(loginField);
        clientPanel.add(passwordLable);
        clientPanel.add(passwordField);
        clientPanel.add(idLable);
        clientPanel.add(idField);


        JPanel serverPanel = new JPanel(new GridLayout(5, 2));
        serverPanel.setBackground(Color.red);

        JLabel lblMessage = new JLabel("Сообщение:");
        JTextField textField = new JTextField();
        textField.setBackground(Color.LIGHT_GRAY);
        JLabel outPutText = new JLabel("Вывод текста: ");
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setBackground(Color.LIGHT_GRAY);
        JButton btnStart = new JButton("отправить");


        serverPanel.add(lblMessage);
        serverPanel.add(textField);
        serverPanel.add(outPutText);
        serverPanel.add(scrollPane);
        serverPanel.add(btnStart);


        /** Конечное добавление панелей и их разделение **/
        setLayout(new GridLayout(2, 1)); // создаёт две строки с одной колонкой
        add(clientPanel);
        add(serverPanel, BorderLayout.SOUTH);
        setVisible(true);



        btnStart.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                message = textField.getText() + ": " + loginField.getText() + ": " + passwordField.getText() + ": " + idField.getText();
                textArea.append(message);

                try
                {
                    SaveToFile saveToFile =  new SaveToFile();
                    saveToFile.writeMessage(message);
                } catch (IOException ex)
                {
                    throw new RuntimeException(ex);
                }

                LoadHistoryFromFile loadHistoryFromFile = new LoadHistoryFromFile();
                String history = loadHistoryFromFile.loadChatHistory();

                textArea.append(history);

                System.out.println("отправленно сообщение: " + message);
            }
        });
    }

}
