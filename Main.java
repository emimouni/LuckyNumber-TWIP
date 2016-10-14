package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Square userInfo = new Square();
        boolean b = true;
        boolean c = true;
        do {
            double x = userInfo.perfectRandom();
            System.out.println("What is your name?");
            String s = input.next();
            System.out.println("What is your next choice");
            int y = input.nextInt();
            do {
                if (y == 0) {
                    b=false;
                    c=false;
                }
                if (y == 1) {
                    System.out.println("Nice to meet you " + s + "! Your lucky number is " + (int) x);
                    b=false;
                    c=false;
                }
                if (y == 2) {
                    break;
                }
            }while (b==true);
        }while (c==true);
    }
}
