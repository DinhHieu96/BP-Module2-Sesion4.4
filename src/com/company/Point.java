package com.company;

public class Point {
    public float x = 0.0f;
    public float y = 0.0f;
    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {getX(), getY()};
        return arr;
    }
    @Override
    public String toString(){
    return "A point has position x is "+x
            +",y is "+y;
    }
}
