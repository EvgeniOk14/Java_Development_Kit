package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile
{
    public void writeMessage(String message) throws IOException {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File file = new File(pathFile);
        FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
        writer.write("\nTxt Format\n");
        writer.write(message.toString());
        writer.flush();
    }
}
