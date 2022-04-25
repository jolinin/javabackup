package tripe;

import java.util.Scanner;

public class tripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x的值");
        int x = sc.nextInt();
        int y;

        if (x >= 3) {
            System.out.println("y=" + (2 * x + 1));
        } else if (x >= -1 && x < 3) {
            System.out.println("y=" + 2 * x);
        } else {
            System.out.println("y=" + (2 * x-1));
        }


    }
}


