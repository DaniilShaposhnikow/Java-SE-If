package com.company;

import java.util.Scanner;

public class Main
{
    public  static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи A");
        double A = in.nextDouble();
        System.out.println("Введи B");
        double B = in.nextDouble();
        System.out.println("Введи C");
        double C = in.nextDouble();
        if (A > 0)
        {
            double A1 = Math.pow(A, 3.0);
            System.out.println(A1);
        }
        if (A < 0)
        {
            double A2 = A;
            A2 = 0;
            System.out.println(A2);
        }
        if (B > 0)
        {
            double B1 = Math.pow(B, 3.0);
            System.out.println(B1);
        }
        if (B < 0)
        {
            double B2 = B;
            B2 = 0;
            System.out.println(B2);
        }
        if (C > 0)
        {
            double C1 = Math.pow(C, 3.0);
            System.out.println(C1);
        }
        if (C < 0)
        {
            double C2 = C;
            C2 = 0;
            System.out.println(C2);
        }
    }
}
