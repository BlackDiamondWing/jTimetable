package de.bremen.jTimetable.gui;

/**
 * Wrapper class for the main class is necessary because the Main Class for the jar can't
 * extend Application.
 */
public class JarMain {

    public static void main(String... args) {
        Main.main(args);
    }
}
