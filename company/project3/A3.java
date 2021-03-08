package com.company.project3;

import java.util.Scanner;

public class A3 {
    public int x, y, z;
    Scanner scanner = new Scanner(System.in);

    public int m1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x->");
        x = scanner.nextInt();
        System.out.print("y->");
        y = scanner.nextInt();
        System.out.print("z->");
        z = scanner.nextInt();

        return (2*x)-7;

    }

    public int m2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x->");
        x = scanner.nextInt();
        System.out.print("y->");
        y = scanner.nextInt();
        System.out.print("z->");
        z = scanner.nextInt();

        return (3*y)+z;
    }

    public int m3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x->");
        x = scanner.nextInt();
        System.out.print("y->");
        y = scanner.nextInt();
        System.out.print("z->");
        z = scanner.nextInt();

        return (12*y)-x+z;
    }
}
