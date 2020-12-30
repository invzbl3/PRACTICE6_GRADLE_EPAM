package com.epam.rd.java.basic.practice6.part6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Part6 {
    private static final Logger logger = Logger.getLogger(Part6.class.getName());

    public static void main(String[] arguments) {
        if (arguments == null) {
            return;
        }
        if (arguments.length < 4) {
            return;
        }
        if ("-i".equals(arguments[0])) {
            arguments[0] = "--input";
        }
        if ("-t".equals(arguments[2])) {
            arguments[2] = "--task";
        }
        if (!"--task".equals(arguments[2])) {
            return;
        }
        if (!"--input".equals(arguments[0])) {
            return;
        }

        String fileContent = content(arguments);

        if ("frequency".equals(arguments[3])) {
            new Part61(fileContent).printFrequencies();
        } else if ("length".equals(arguments[3])) {
            new Part62(fileContent).printLengths();
        } else if ("duplicates".equals(arguments[3])) {
            new Part63(fileContent).printDuplicates();
        } else {
            System.out.print("");
        }
    }

    public static String content(String[] arguments) {
        String fileContent = null;
        try {
            fileContent = new String(Files.readAllBytes(Paths.get(arguments[1])), StandardCharsets.UTF_8);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "exception during reading of a file", e);
        }
        return fileContent;
    }
}