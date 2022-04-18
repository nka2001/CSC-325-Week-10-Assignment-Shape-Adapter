/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

import com.mycompany.oldDrawingSys.Circle;
import com.mycompany.oldDrawingSys.OriginalSys;
import com.mycompany.oldDrawingSys.Rectangle;


/**
 *
 * @author MoaathAlrajab
 */
public class ModifiedSystem   {
    public static void main(String[] args) {
//
        Rectangle testTangle = new Rectangle();//test case 1, make rectangle 
        Circle c1 = new Circle();//test case 2, make circle
        Shape[] shapes = {new RectangleAdapter(testTangle), new CircleAdapter(c1)  };//added adaptable classes to each shape
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
//needs to be an adapter to both the rectangle and the circle 
    
}
