/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
    public class Square extends Rectangle{
    
    Square(double w){
        width = w;
        height = w;
    }       

    Square() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
        this.width = height;
    }
    
    @Override
    public String toString(){
        String str = "Это квадрат со стороной: " + width;
        return  str; 
    }    
}
