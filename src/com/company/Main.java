package com.company;

public class Main {

    public static void main(String[] args) {
        String MGCJ = "blue water";
        final int NUM = 40;
        String word = MGCJ + NUM;
        if (NUM > 0) {
            System.out.println("вы сохранили положительное число");
        }
        if (NUM < 0) {
            System.out.println("вы сохранили отрицательное число");
        } else {

            System.out.println("вы сохранили нуль");
        }
    }