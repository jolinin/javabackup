package com.company;

import java.util.Scanner;

class ifpanduan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        int max;
        if (a > b) {
            System.out.println("max=" + a);
        } else {
            System.out.println("max=" + b);

        }
    }
}
