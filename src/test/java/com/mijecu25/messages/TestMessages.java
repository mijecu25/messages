package com.mijecu25.messages;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for Messages class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 1.0.1.1
 */
public class TestMessages {
    
    /**
     * Test FATAL_EXCEPTION_ACTION.
     */
    @Test
    public void message1() {
        // Assert that the method returns something
        Assert.assertNotNull(Messages.FATAL_EXCEPTION_ACTION("Some exception"));
    }
    
    /**
     * Test FATAL_EXIT
     */
    @Test
    public void message2() {
        // Assert that the method returns something
        Assert.assertNotNull(Messages.FATAL_EXIT("Some program", "Some exception"));
    }
    
    /**
     * Test QUIT_PROGRAM_ERROR
     */
    @Test
    public void message3() {
        // Assert that the method returns something
        Assert.assertNotNull(Messages.QUIT_PROGRAM_ERROR("Some program"));
    }
}
