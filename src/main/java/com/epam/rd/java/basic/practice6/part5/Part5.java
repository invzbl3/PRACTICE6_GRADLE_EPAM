package com.epam.rd.java.basic.practice6.part5;

public class Part5 {
    private static final String DELIMITER = "~~~~~~~";
    public static void main(String[] s){
        Tree<Integer> tree = new Tree<>();
        tree.add(new Integer[]{3, 1, 5, 0, 2, 4});
        System.out.println(tree.add(6));
        System.out.println(tree.add(6));
        System.out.println(DELIMITER);
        tree.print();
        System.out.println(DELIMITER);
        System.out.println(tree.remove(5));
        System.out.println(tree.remove(5));
        System.out.println(DELIMITER);
        tree.print();
    }
}