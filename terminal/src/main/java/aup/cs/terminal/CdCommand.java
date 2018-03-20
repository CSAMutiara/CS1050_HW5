package aup.cs.terminal;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * CdCommand class.
 */

public final class CdCommand extends Command {
    
    String child;
    
    public CdCommand(File f, String c) {
        super(f);
        this.child = child;
    }
    
    /**
     * exec method executes an action.
     */
    public File exec() {
        file = new File(file, child);
        return file;
    }
    
}