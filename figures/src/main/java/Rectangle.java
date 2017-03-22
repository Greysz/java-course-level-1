/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Rectangle {
     protected double width;
    protected double height;
    
    /**
     *
     */
    protected Rectangle(){
        width = 0d;
        height = 0d;
    }
    public Rectangle(double w, double h){
        width = w;
        height = h;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getsq(){
        return width * height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getPerimeter(){
        return (width + height) * 2;
    }
    
     @Override
    public String toString(){
        String str = "Это прямоугольник со сторонами: длина " + width + " ширина " + height;
        return  str; 

}
}
