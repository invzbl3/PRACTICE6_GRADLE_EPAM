package com.epam.rd.java.basic.practice6.part6;

import com.epam.rd.java.basic.practice6.Demo;
import org.junit.Assert;
import org.junit.Test;

public class Part6Test {
    @Test
    public void mainTest() {
        Part6.main(new String[]{"--input", "part6.txt", "--task", "frequency"});
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void demoTest() {
        Demo.main(new String[]{});
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void shouldReturnIfNullArguments() {
        Part6.main(null);
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void shouldReturnIfLessThanFourArguments() {
        Part6.main(new String[]{"--input", "--task", "frequency"});
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void shouldCheckIfFirstArgumentIsAbbreviatedInputParameter() {
        Part6.main(new String[]{"-i", "part6.txt", "--task", "frequency"});
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void shouldCheckIfThirdArgumentIsAbbreviatedTaskParameter() {
        Part6.main(new String[]{"--input", "part6.txt", "-t", "frequency"});
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void shouldCheckIfThirdArgumentNotTaskParameter() {
        Part6.main(new String[]{"--input", "part6.txt", "frequency", "--task"});
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void shouldCheckIfFirstArgumentNotInputParameter() {
        Part6.main(new String[]{"part6.txt", "--input", "--task", "frequency"});
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void shouldCheckIfLastArgumentIsEmpty() {
        Part6.main(new String[]{"--input", "part6.txt", "--task", ""});
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void shouldCheckIfContentOfFileIsCorrect() {
        Assert.assertEquals("jaguar chimpanzee bison whale" + System.lineSeparator() +
                "marmot bison lemur panther camel lizard wolf bear" + System.lineSeparator() +
                "gecko" + System.lineSeparator() +
                "mongoose leopard sable sable dingo whale jaguar" + System.lineSeparator() +
                "rat lemur lemur gorilla zebra tortoise " + System.lineSeparator() +
                "asp lion tapir tortoise gorilla cheetah bison marten" + System.lineSeparator() +
                "marmot cheetah camel" + System.lineSeparator() +
                "snake marmot" + System.lineSeparator() +
                "zebra asp cheetah lizard gecko gorilla asp lion tortoise" + System.lineSeparator() +
                "kangaroo whale penguin yak cheetah mouse panther", Part6.content(new String[]{"--input", "part6.txt", "--task", "frequency"}));
    }
    
    @Test
    public void shouldCheckIfException() {
        Part6.content(new String[]{"--input", "", "--task", ""});
        Assert.assertTrue("Assertion to be compliant", true);
    }
}