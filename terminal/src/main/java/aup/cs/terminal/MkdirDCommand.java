package aup.cs.terminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * MkdirDCommand class.
 */

public final class MkdirDCommand extends Command {
    
    protected File newDir;
    protected String name;
    
    public MkdirDCommand(File f, String name) {
        super(f);
        this.name = name;
    }
    
    /**
     * exec method executes an action.
     */
    public File exec() throws TerminalExecutionException {
        newDir = new File(name);
        newDir.mkdir();
        return file;
    }
    
}