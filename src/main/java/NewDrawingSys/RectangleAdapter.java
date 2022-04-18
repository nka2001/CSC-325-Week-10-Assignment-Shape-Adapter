/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

import com.mycompany.oldDrawingSys.Rectangle;

/**
 *
 * @author nicka
 */
public class RectangleAdapter implements Shape {//adapter for rectangle 
    
    private Rectangle adaptee;//adaptable rectangle object
    public RectangleAdapter(Rectangle r){//overloaded constructor
        this.adaptee = r;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {//draw method from shape interface
        int width = Math.abs(x2-x1);//find the width
        int height = Math.abs(y2-y1);//find the height
        
        int c1 = Math.min(x1, x2);//find the corner point
        int c2 = Math.min(y1,y2);//find the corner point
        
        adaptee.draw(c1,c2,width, height);//draw the shape using the old cirles draw method
                
        
        
        
   }
    
}
