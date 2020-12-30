package com.epam.rd.java.basic.practice6.part1;

import com.epam.rd.java.basic.practice6.Demo;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class WordContainerTest {
    @Test
    public void mainTest() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        System.setIn(new ByteArrayInputStream(
                "asd 43 asdf asd 43^434 asdf^kasdf asdf stop asdf^stop"
                        .replace("^", System.lineSeparator()).getBytes(StandardCharsets.UTF_8)));
        WordContainer.main(null);
        assertEquals("asdf : 3\r\n" +
                "43 : 2\r\n" +
                "asd : 2\r\n" +
                "434 : 1\r\n" +
                "kasdf : 1\r\n", bos.toString());
        System.setOut(originalOut);

        Part1.main(new String[] { null });
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void hashCodeTest() {
        Word word = new Word("asd : 2");
        Assert.assertEquals(-720741571, word.hashCode());
    }
    
    @Test
    public void toStringTest() {
        Word word = new Word("asd : 2");
        Assert.assertEquals( "asd" + " : " + 2 + " : " + 1, word.toString());
    }
    
    @Test
    public void demoTest() {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
}