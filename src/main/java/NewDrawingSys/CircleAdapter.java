/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

import com.mycompany.oldDrawingSys.Circle;

/**
 *
 * @author nicka
 */
public class CircleAdapter implements Shape {

    private Circle adaptee;//create an adaptable circle

    public CircleAdapter(Circle c) {//constructor with circle as a parameter
        this.adaptee = c;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {//draw method from the shape interface

        int width = Math.abs(x2 - x1);//find the width of the rectangle 
        int height = Math.abs(y2 - y1);//find the height of the rectangle

        int centerX = width / 2;//find the center point of the rectangle 
        int centerY = height / 2;//find the center point of the rectangle 

        int maxRadius = height;//since the circle is drawn inside the rectangle, the height is the max radius of the circle

        adaptee.draw(centerX, centerY, maxRadius);//draw the circle using the circles draw mwthod that takes a center point and radius as parameters

    }

}
