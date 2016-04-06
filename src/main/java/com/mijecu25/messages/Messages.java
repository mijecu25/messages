package com.mijecu25.messages;

/**
 * Messages class with debugging messages.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 1.0.0.1
 */
public abstract class Messages {
    
    public static final String SPACE = " ";
    public static final String WARNING = "WARNING: ";
    public static final String ERROR = "ERROR: ";
    public static final String FATAL = "FATAL: ";
    public static final String CHECK_LOG_FILES = "Please check the log files.";
    public static final String QUIT_ERROR = "Quitting SQLPlus because of an error";
    
    /**
     * Used when catching a fatal exception.
     * 
     * @param exception the exception that was caught
     * @return string with message
     */
    public static final String FATAL_EXCEPTION_ACTION(String exception) {
        return "There was a " + exception + " when your last action was executed.";
    }
    
    /**
     * Used when exciting because of a fatal exception.
     * 
     * @param exception the exception that was caught
     * @return string with message
     */
    public static final String FATAL_EXIT(String exception) {
        return "Exiting SQLPlus because of a " + exception;
    }
}
