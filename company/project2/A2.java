package com.company.project2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A2 {
    private int m[] = new int [10];
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
            m[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(m));

    }

    public int m3() {
        int v1, v2, v3, v4, v5, v6, v7, v8, v9, v10;
        Random random = new Random();
        for(int i=0; i<m.length; i++){
            m[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(m));

        if (m[0] < 1) {v1 = m[0];} else v1 = 0;
        if (m[1] < 2) {v2 = m[1];} else v2 = 0;
        if (m[2] < 3) {v3 = m[2];} else v3 = 0;
        if (m[3] < 4) {v4 = m[3];} else v4 = 0;
        if (m[4] < 5) {v5 = m[4];} else v5 = 0;
        if (m[5] < 6) {v6 = m[5];} else v6 = 0;
        if (m[6] < 7) {v7 = m[6];} else v7 = 0;
        if (m[7] < 8) {v8 = m[7];} else v8 = 0;
        if (m[8] < 9) {v9 = m[8];} else v9 = 0;
        if (m[9] < 10) {v10 = m[9];} else v10 = 0;
        System.out.print("jami=");
        return v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10;
    }

    public int m4() {
        int v1, v2, v3, v4, v5, v6, v7, v8, v9, v10;
        Random random = new Random();
        for(int i=0; i<m.length; i++){
            m[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(m));

        if (m[0] > 1) {v1 = 1;} else v1 = 1;
        if (m[1] > 2) {v2 = 2;} else v2 = 1;
        if (m[2] > 3) {v3 = 3;} else v3 = 1;
        if (m[3] > 4) {v4 = 4;} else v4 = 1;
        if (m[4] > 5) {v5 = 5;} else v5 = 1;
        if (m[5] > 6) {v6 = 6;} else v6 = 1;
        if (m[6] > 7) {v7 = 7;} else v7 = 1;
        if (m[7] > 8) {v8 = 8;} else v8 = 1;
        if (m[8] > 9) {v9 = 9;} else v9 = 1;
        if (m[9] > 10) {v10 = 10;} else v10 = 1;
        System.out.print("namravli=");
        return v1 * v2 * v3 * v4 * v5 * v6 * v7 * v8 * v9 * v10;
    }
}