package com.company;

public class MoveablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public MoveablePoint(){

    }
    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr={getxSpeed(),getySpeed()};
        return arr;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
    @Override
    public String toString(){
        return "A MoveablePoint has xSpeed is "+xSpeed
                +" ,ySpeed is "+ySpeed
                +" and is subclass of "
                + this.x +" and "+ this.y;
    }
}
