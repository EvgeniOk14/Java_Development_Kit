package org.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame
{
    private static final  int WINDOW_HEIGHT = 230;
    private static final  int WINDOW_WIDTH = 350;


    SettingsWindow(GameWindow gameWindow)
    {
        /** общие настройки окна "SettingsWindow" **/
        setTitle("игровое окно"); // заголовок окна
        setLocationRelativeTo(gameWindow); // установка данного окна "SettingsWindow", относительно основного окна "gameWindow"
        setResizable(false); // установка не изменяемости размеров окна пользователем
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // установка размеров окна

        /** Создание кнопок и группы, а также добавление радиобатон-кнопок в группу **/
        ButtonGroup buttonGroup = new ButtonGroup(); // создание группы для радиокнопок
        JRadioButton HumanVsAi = new JRadioButton("человек против компьютера"); // создание кнопки "человек против компьютера"
        buttonGroup.add(HumanVsAi); // добавление радиокнопки "игра человека против компьютера" в группу "buttonGroup"
        HumanVsAi.setSelected(true); // выбор данной кнопки по умолчанию при открытии окна
        JRadioButton HumanVsHuman = new JRadioButton("человек против человека"); // создание кнопки "человек против человека"
        buttonGroup.add(HumanVsHuman); // добавление радиокнопки "игра человека против человека" в группу "buttonGroup"

        /** Создание панели для кнопок "радиобатон", а также добавление кнопок  радио-батн на созланную панель **/
        JPanel panelBottom = new JPanel(new GridLayout(9,1)); // создание панели для "радиокнопок"
        JLabel btnSelectPlay = new JLabel("Выберите режим игры: "); // создание надписи "выбор игры"
        panelBottom.add(btnSelectPlay); // добавление надписи на панель
        panelBottom.add(HumanVsAi); // добавление радио кнопки "игра человека против компьютера"
        panelBottom.add(HumanVsHuman); // добавление радио кнопки "игра человека против человека"

        /** Создание слайдеров (ползунковых переключателей) **/
        JLabel SizeField = new JLabel("Выберите размер поля: "); // создание надписи перед первым ползунковым переключателем
        JSlider field = new JSlider(3, 8); // создание первого ползункового переключателя
        JLabel winSize = new JLabel("Выберите длину выйгрыша: "); // создане надписи пере вторым ползунковым переключателем
        JSlider winLength =  new JSlider(3,8); // // создание второго ползункового переключателя

        /** Добавление ползунковому переключателю "Выберите размер поля" изменения его параметра переключения **/
        field.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                SizeField.setText("установленный размер поля: " + field.getValue());
            }
        });

        /** Добавление ползунковому переключателю "Выберите длину выйгрыша" изменения его параметра переключения **/
        winLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                winSize.setText("установленная длина выйгрыша: " + winLength.getValue());
            }
        });


        /** Добавление всех элементов ползунковых переключателей в соответствующую панель **/
        panelBottom.add(SizeField); // добавление первого названия ползункового переключателя
        panelBottom.add(field); // добавление первого ползункового переключателя
        panelBottom.add(winSize); // добавление второго названия ползункового переключателя
        panelBottom.add(winLength); // добавление второго ползункового переключателя



        /** Создание панели для кнопки "начало новой игры", а также добавление кнопки начала игры на созданную панель **/
        JPanel btnStartPanel = new JPanel(new GridLayout(1,1)); // создание панели для кнопки "начало новой игры"
        JButton btnStart = new JButton("начало новой игры"); // создание кнопки  "начало новой игры"
        btnStartPanel.add(btnStart); // добавление кнопки "начало игры" на панель

        /** Добавление двух созланных панелей с кнопками на окно и установка их видимости **/
        add(panelBottom); // добавление панели с "радиокнопками"
        add(btnStartPanel, BorderLayout.SOUTH); // добавление панели с кнопкой "начало новой игры"
        setVisible(true); // установка видимости этих панелей и кннопок

        /** настройка слушателя для кнопки: "начало новой игры" **/
        btnStart.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gameWindow.map.startNewGame(0,3,3,3); // вызов метода: startNewGame из Класса Map()
            }
        });
    }
}
