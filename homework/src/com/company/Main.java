package com.company;


public class Main {

    public static void main(String[] args) {
        Point originOne = new Point(23, 90);
        Rectangle rectOne = new Rectangle(100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        System.out.println("rectOne的高度：" + rectOne.getHeight());
        System.out.println("rectOne的宽度：" + rectOne.getWidth());
        System.out.println("rectOne的面积：" + rectOne.area());

        System.out.println("rectTwo的位置:" + rectTwo.getOrigin().getX()+ "," + rectTwo.getOrigin().getY());
        rectTwo.move(40, 72);
        System.out.println("rectTwo的位置为" + rectTwo.getOrigin().getX() + "," + rectTwo.getOrigin().getY());







    }
}
