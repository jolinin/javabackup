package Randomname;

import java.util.Random;
import java.util.Scanner;
//随机点名器


public class randomname {
    public static void main(String[] args) {
        System.out.println("-----随机点名器-----");
        String[] students = new String[3];
        addstudentName(students);
        printstudentName(students);
        String randomname = randnamestudentName(students);
        System.out.println("被点到同学姓名是："+randomname);
    }

    public static void addstudentName(String[] students) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("储存第" + (i + 1) + "个姓名:");
            //接受控制台输出的姓名
            students[i] = sc.next();
        }
    }

    public static void printstudentName(String[] students) {
        for (int i = 0; i < students.length; i++) {
            String name = students[i];
            System.out.println("第" + (i + 1) + "个同学名：" + name);


        }
    }

    public static String randnamestudentName(String[] students) {
        int index = new Random().nextInt(students.length);
        String name = students[index];
        return name;
    }


}
