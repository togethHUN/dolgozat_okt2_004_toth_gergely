/*
* File: Writer.java
* Author: Tóth Gergely
* Copyright: 2026, Tóth Gergely
* Group: Szoft II/N
* Date: 2026-10-06
* Github: https://github.com/togethHUN/
* Licenc: MIT
*/


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer implements Writable {

    private final String fileName;

  
    public Writer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeContent(String content) {
   
        tryWriteContent(content);
    }

    private void tryWriteContent(String content) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println(content);
            System.out.println("Sikeres fájlba írás: " + fileName);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}