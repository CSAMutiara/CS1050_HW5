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
        this.files = deletable.listFiles();
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