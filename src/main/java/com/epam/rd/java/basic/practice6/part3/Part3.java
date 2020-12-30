package com.epam.rd.java.basic.practice6.part3;

public class Part3 {
    public static void main(String[] s){
        Parking parking = new Parking(4);
        parking.print();

        System.out.print(parking.arrive(2) + " ");
        parking.print();
        System.out.print(parking.arrive(3) + " ");
        parking.print();
        System.out.print(parking.arrive(2) + " ");
        parking.print();
        System.out.print(parking.arrive(2) + " ");
        parking.print();
        System.out.print(parking.arrive(2) + " ");
        parking.print();
        System.out.print(parking.depart(1) + " ");
        parking.print();
        System.out.print(parking.depart(1) + " ");
        parking.print();
    }
}