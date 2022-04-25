package com.company;

import com.company.Point;

public class Rectangle {
    private int width;
    private int height;
    private Point origin;

    public Rectangle (){
        origin= new Point(0,0);
    }

    public Rectangle(Point p){
        origin=p;
    }

    public Rectangle(int w,int h){
        this (new Point(0,0),w,h);
    }

    public Rectangle(Point p, int w,int h){
        origin=p;
        width=w;
        height=h;

    }
    public void move (int x,int y){
        origin.setX(x);
        origin.setY(y);
    }

    public void setWidth(int w){
        width=w;
    }
    public void setHeight(int h){
        height=h;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int area(){
        return width*height;
    }

    public Point getOrigin() {
        return origin;
    }
}
