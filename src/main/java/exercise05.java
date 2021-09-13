/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first number?");
        int first = input.nextInt();
        System.out.println("What is the second number?");
        int second = input.nextInt();
        int sum = first + second;
        int dif = first - second;
        int pro = first * second;
        int quo = first / second;
        System.out.printf("%d + %d = %d\n" + "%d - %d = %d\n" + "%d * %d = %d\n" + "%d / %d = %d", first, second, sum, first, second, dif, first, second, pro, first, second, quo);
    }
}