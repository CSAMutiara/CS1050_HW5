package aup.cs.terminal;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Command class.
 */

public class Command {
    
    protected File f;
    
    public Command() {
        this.f = new File(".");
    }
    
    public Command(File f) {
        this.f = f;
    }
    
    /**
     * exec method executes an action.
     */
    public File exec() {
        return this.f;
    }
    
}