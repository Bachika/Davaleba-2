package com.company.project2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B2 {
    private double m[] = new double [12];
    Scanner scanner = new Scanner(System.in);

    public void m1() {
        System.out.print("masivi= ");
        for(int i=0;i<m.length;i++)
        {
            m[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(m));
    }
    public void m2() {
        Random random = new Random();
        for(int i=0; i<m.length; i++){
            m[i] = random.nextDouble()+random.nextInt(14);
        }
        System.out.println(Arrays.toString(m));
    }
    public void m3() {
        Random random = new Random();
        for(int i=0; i<m.length; i++){
            m[i] = random.nextDouble()+random.nextInt(14);
        }
        System.out.println(Arrays.toString(m));
        System.out.println("romlebic metia 7ze=");
        if (m[0] > 7) {System.out.println("Index 0 - "+m[0]);}
        if (m[1] > 7) {System.out.println("Index 1 - "+m[1]);}
        if (m[2] > 7) {System.out.println("Index 2 - "+m[2]);}
        if (m[3] > 7) {System.out.println("Index 3 - "+m[3]);}
        if (m[4] > 7) {System.out.println("Index 4 - "+m[4]);}
        if (m[5] > 7) {System.out.println("Index 5 - "+m[5]);}
        if (m[6] > 7) {System.out.println("Index 6 - "+m[6]);}
        if (m[7] > 7) {System.out.println("Index 7 - "+m[7]);}
        if (m[8] > 7) {System.out.println("Index 8 - "+m[8]);}
        if (m[9] > 7) {System.out.println("Index 9 - "+m[9]);}
        if (m[10] > 7) {System.out.println("Index 10 - "+m[10]);}
        if (m[11] > 7) {System.out.println("Index 11 - "+m[11]);}

    }

    public double m4() {
        Random random = new Random();
        for(int i=0; i<m.length; i++){
            m[i] = random.nextDouble()+random.nextInt(14);
        }
        System.out.println(Arrays.toString(m));
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
        System.out.println("min="+m[0]);
        System.out.println("max="+m[11]);
        return m[11]-m[0];
    }
}
