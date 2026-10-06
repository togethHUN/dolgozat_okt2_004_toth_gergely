/*
* File: App.java
* Author: Tóth Gergely
* Copyright: 2026, Tóth Gergely
* Group: Szoft II/N
* Date: 2026-10-06
* Github: https://github.com/togethHUN/
* Licenc: MIT
*/


public class App {
    public static void main(String[] args) {
        Writable writer = new Writer("outFile.txt");
        writer.writeContent("Ez egy teszt szöveg, amit a Writer osztály írt az outFile.txt fájlba.");
    }
}