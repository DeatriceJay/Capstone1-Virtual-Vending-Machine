package com.techelevator;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;

public class LogWriterTest {
    LogWriter testWriter = new LogWriter();
    Scanner sc = new Scanner("./log.txt");

    @Before
    public void setUp() throws Exception {
        testWriter.writer("Hello", new BigDecimal("1"), new BigDecimal("311"));
    }

    @Test
    public void test() {
        assertEquals(true, sc.hasNextLine());
        sc.nextLine();
        assertEquals(false, sc.hasNextLine());
    }
}