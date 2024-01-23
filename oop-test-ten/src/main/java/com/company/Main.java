package com.company;

public class Main {
    public static void main(String[] args) {

        MyTime time1 = new MyTime(12, 30, 45);
        MyTime time2 = new MyTime();  // Default constructor

        System.out.println("Initial Time 1: " + time1.toString());
        System.out.println("Initial Time 2: " + time2.toString());

        time1.nextSecond();
        System.out.println("Next Second Time 1: " + time1.toString());

        time2.setHour(15);
        time2.setMinute(45);
        time2.setSecond(20);
        System.out.println("Updated Time 2: " + time2.toString());

        time1.previousMinute();
        System.out.println("Previous Minute Time 1: " + time1.toString());

        time2.nextHour();
        System.out.println("Next Hour Time 2: " + time2.toString());

    }
}