package aup.cs.terminal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * RmFCommand class.
 */

public final class RmFCommand extends Command {
    
    protected File removable;
    
    public RmFCommand(File removable) {
        super();
        this.removable = removable;
    }
    
    /**
     * exec method executes an action.
     */
    public File exec() throws TerminalExecutionException {
        file.delete();
        return file;
    }
    
}