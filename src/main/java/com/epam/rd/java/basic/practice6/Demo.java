package com.epam.rd.java.basic.practice6;

import com.epam.rd.java.basic.practice6.part1.Part1;
import com.epam.rd.java.basic.practice6.part2.Part2;
import com.epam.rd.java.basic.practice6.part3.Part3;
import com.epam.rd.java.basic.practice6.part4.Part4;
import com.epam.rd.java.basic.practice6.part5.Part5;
import com.epam.rd.java.basic.practice6.part6.Part6;

public class Demo {
    private static final String PARAM_INPUT = "--input";
    private static final String PARAM_TASK = "--task";
    private static final String FILE_PATH = "part6.txt";

    public static void main(String[] s) {
        System.out.println("~~~~~~~~~~~Part1");
        Part1.main(null);
        System.out.println("~~~~~~~~~~~Part2");
        Part2.main(null);
        System.out.println("~~~~~~~~~~~Part3");
        Part3.main(null);
        System.out.println("~~~~~~~~~~~Part4");
        Part4.main(null);
        System.out.println("~~~~~~~~~~~Part5");
        Part5.main(null);
        System.out.println("~~~~~~~~~~~Part6");
        Part6.main(new String[] {PARAM_INPUT, FILE_PATH, PARAM_TASK, "frequency"});
        Part6.main(new String[] {PARAM_INPUT, FILE_PATH, PARAM_TASK, "length"});
        Part6.main(new String[] {PARAM_INPUT, FILE_PATH, PARAM_TASK, "duplicates"});
    }
}
