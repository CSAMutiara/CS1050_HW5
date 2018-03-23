package aup.cs.terminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * RmRCommand class.
 */

public final class RmRCommand extends Command {
    
    protected File deletable;
    protected File[] files;
    
    public RmRCommand(File f, File deletable) {
        super(f);
        this.files = deletable.listFiles();
        this.deletable = deletable;
    }
    
    /**
     * exec method executes an action.
     */
    public File exec() throws TerminalExecutionException {
        if (files != null) {
            for (File f: files) {
                f.delete();
            }
        }
        deletable.delete();
        return file;
    }
    
}