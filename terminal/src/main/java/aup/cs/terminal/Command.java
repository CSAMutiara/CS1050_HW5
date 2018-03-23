package aup.cs.terminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Command super-class.
 */

public class Command {
    
    protected File file;
    
    public Command() {
        this.file = new File(".");
    }
    
    public Command(File f) {
        this.file = file;
    }
    
    /**
     * exec method executes an action.
     */
    public File exec() throws FileNotFoundException {
        return this.file;
    }
    
}