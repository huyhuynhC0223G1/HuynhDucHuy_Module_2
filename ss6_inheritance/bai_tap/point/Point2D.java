package ss6_inheritance.bai_tap.point;

import java.util.Arrays;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point2D(){
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
    }
    public float[] getXY(){
        float[] array={getX(),getY()};
        return array;
    }
    public String toString(){
        return "x,y= "+ Arrays.toString(getXY());
    }
}
