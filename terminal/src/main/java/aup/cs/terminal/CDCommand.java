package aup.cs.terminal;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Command class.
 */

public final class CDCommand extends Command{
    
    public CDCommand() {
        super();
    }
    
    public CDCommand(File f) {
        super(f);
    }
    
    /**
     * exec method executes an action.
     */
    public File exec() {
        System.exit(00);
        return this.f;
    }
    
}