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
    protected String d;
    
    public MkdirDCommand(String name) {
        super();
        this.d = name;
    }
    
    /**
     * exec method executes an action.
     */
    public File exec() {
        newDir = new File(d);
        newDir.mkdir();
        return file;
    }
    
}