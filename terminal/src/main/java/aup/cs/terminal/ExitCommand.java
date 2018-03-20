package aup.cs.terminal;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ExitCommand class.
 */

public final class ExitCommand extends Command {
    
    public ExitCommand() {
        super();
    }
    
    public ExitCommand(File f) {
        super(f);
    }
    
    /**
     * exec method executes an action.
     */
    public File exec() {
        System.exit(00);
        return this.file;
    }
    
}