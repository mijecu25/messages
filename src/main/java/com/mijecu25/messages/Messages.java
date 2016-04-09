package com.mijecu25.messages;

/**
 * Messages class with debugging messages.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 1.0.1.1
 */
public abstract class Messages {
    
    public static final String SPACE = " ";
    public static final String WARNING = "WARNING: ";
    public static final String ERROR = "ERROR: ";
    public static final String FATAL = "FATAL: ";
    public static final String CHECK_LOG_FILES = "Please check the log files.";
    
    /**
     * Used when catching a fatal exception.
     * 
     * @param exception the exception that was caught
     * @return string with message
     */
    public static String FATAL_EXCEPTION_ACTION(String exception) {
        return "There was a " + exception + " when your last action was executed.";
    }

    /**
     * Used when exiting a program because of a fatal exception.
     * 
     * @param program the name of the program
     * @param exception the exception that was caught
     * @return string with message
     */
    public static String FATAL_EXIT(String program, String exception) {
        return "Exiting " + program + " because of a " + exception;
    }
    
    /**
     * Used when quitting a program because of an error.
     * 
     * @param program the name of the program
     * @return string with message
     */
    public static String QUIT_PROGRAM_ERROR(String program) {
        return "Quitting " + program + " because of an error";
    }
}
