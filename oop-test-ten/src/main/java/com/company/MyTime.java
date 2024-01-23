package com.company;


public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    private void setTime(int hour, int minute, int second) {
        if (isValidTime(hour, minute, second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Invalid hour, minute or second!");
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Invalid hour!");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("Invalid minute!");
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            System.out.println("Invalid second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    private boolean isValidTime(int hour, int minute, int second) {
        return (hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59);
    }

    public MyTime nextSecond() {
        second = (second + 1) % 60;
        if (second == 0) {
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        minute = (minute + 1) % 60;
        if (minute == 0) {
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        hour = (hour + 1) % 24;
        return this;
    }

    public MyTime previousSecond() {
        second = (second - 1 + 60) % 60;
        if (second == 59) {
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        minute = (minute - 1 + 60) % 60;
        if (minute == 59) {
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        hour = (hour - 1 + 24) % 24;
        return this;
    }

}
