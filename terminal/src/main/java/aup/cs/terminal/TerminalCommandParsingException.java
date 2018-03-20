package aup.cs.terminal;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * TerminalCommandParsingException super-class.
 */

public class TerminalCommandParsingException extends TerminalParsingException {
    
    public TerminalCommandParsingException(String message) {
        super(message);
    }
    
}