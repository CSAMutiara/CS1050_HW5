package aup.cs.terminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * CatFCommand class.
 */

public final class CatFCommand extends Command {
    
    protected File printable;
    
    public CatFCommand(File printable) {
        super();
        this.printable = printable;
    }
    
    /**
     * exec method executes an action.
     */
    public File exec() throws TerminalExecutionException {
        try  {
            Scanner sc = new Scanner(printable);
            String input = sc.nextLine();
            while (sc.hasNextLine()) {
                System.out.println(input);
            }
            return file;
        } catch (FileNotFoundException e) {
            throw new TerminalExecutionException("Print Contents of File cannot find file "
                + "argument. Please try again with existing file");
        }
    }
    
}