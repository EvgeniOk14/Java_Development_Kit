package org.example;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class LoadHistoryFromFile
{


    public String loadChatHistory()
    {
        try
        {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");

            // Проверка существования файла
            if (Files.exists(Paths.get(pathFile)))
            {
                // Чтение содержимого файла
                String content = new String(Files.readAllBytes(Paths.get(pathFile)));
                System.out.println("Содержимое файла: " + content); // Отладочный вывод
                return content;
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return null;
    }


}
