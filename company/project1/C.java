package com.company.project1;

import java.util.Scanner;

public class C {
    private int a, b, c;

    public void m1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a->");
        a = scanner.nextInt();
        System.out.print("b->");
        b = scanner.nextInt();
        System.out.print("c->");
        c = scanner.nextInt();

    }

    public void m2() {
        System.out.println(a%10);


    }

    public int m3() {
        return b/10;
    }
    public int m4() {
        return (c/10)+(c%10);
    }

    public void m5() {
        System.out.println((a%10)*(m3()));
    }

    public void m6() {
        System.out.println(m3()+((a%10)*(m3())));
    }
}