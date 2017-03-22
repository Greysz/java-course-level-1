/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class circle {
       private double radius;

    public circle() {
        radius = 0;
    }

    public circle(double r) {
        radius = r;
    }

    /**
     * Get the value of radius
     *
     * @return the value of radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set the value of radius
     *
     * @param radius new value of radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius;
    }
    
       @Override
    public String toString(){
        String str = "Это круг с радиусом: " + getRadius();
        return  str; 
    }
}

    
