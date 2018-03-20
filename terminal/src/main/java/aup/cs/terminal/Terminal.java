package aup.cs.terminal;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Terminal class: home file.
 */

public final class Terminal {
    
    /**
     * start executes command line loop.
     */
    public void start() {
        File f = new File(".");
        while (true) {
            try {
                System.out.print(f.getCanonicalPath() + " > ");
                Command com = getCommand(f);
                f = com.exec();
            } catch (IOException e) {
                System.out.println("Oop");
            }
        }
    }
    
    /**
     * getCommand scans and returns the command user typed into command line.
     */
    public Command getCommand(File f) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("exit")) {
            return new ExitCommand();
        }
        return null; //later returns input
    }
    
    /**
     * main method.
     */
    public static void main(String[] args) {
        Terminal t = new Terminal();
        t.start();
    }
    
}