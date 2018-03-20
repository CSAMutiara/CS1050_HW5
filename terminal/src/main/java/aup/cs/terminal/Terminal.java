package aup.cs.terminal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
            } catch (TerminalArgumentParsingException e) {
                System.out.println("Oop");
            }
        }
    }
    
    /**
     * getCommand scans and returns the command user typed into command line.
     */
    public Command getCommand(File f) throws TerminalArgumentParsingException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        if (input.equals("exit")) {
            return new ExitCommand();
        } else if (words[0].equals("cd")) {
            if (words.length != 2) {
                throw new TerminalArgumentParsingException("Change Directory requires an argument");
            }
            return new CdCommand(f, words[1]);
        } else if (words[0].equals("rm") && words[1].equals("f")) {
            if (words.length != 3) {
                throw new TerminalArgumentParsingException("Remove File From"
                + "Current Directory requires an argument");
            }
        }
        return new Command(); //later returns input
    }
    
    /**
     * main method.
     */
    public static void main(String[] args) {
        Terminal t = new Terminal();
        t.start();
    }
    
}