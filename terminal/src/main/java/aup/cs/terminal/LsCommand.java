package aup.cs.terminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * LsCommand class.
 */

public final class LsCommand extends Command {
    
    protected File[] files;
    
    public LsCommand(File f) {
        super(f);
        this.files = file.listFiles();
    }
    
    /**
     * exec method executes an action.
     */
    public File exec() throws TerminalExecutionException {
        if (files != null) {
            for (File f: files) {
                double bytes = f.length();
                double date = f.lastModified();
                if (f.isFile()) {
                    System.out.println("File: " + f.getName()
                        + " (last modified: " + date + ") - "
                        + bytes + " byte");
                } else if (f.isDirectory()) {
                    System.out.println("Directory: " + f.getName()
                        + " (last modified: " + date + ") - "
                        + bytes + " byte");
                }
            }
        }
        return file;
    }
    
}