/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unitoneactivityoneareaofarectangle;
import java.util.Scanner;
/**
 *Jacob Lacey
 *19 Sept 2018
 *To Calculate and Output/Print the Area of a Rectangle
 *UDATED 1 OCT 2018
 *Use Scanner now
 */
public class UnitOneActivityOneAreaOfARectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        double width = 2;//u
        double length = 3;//u
        double area;//u2
        
        //algorithm to find the area of a rectangle
        area = width * length;
        
        //printing all thre variables on different lines
        System.out.println("the width is "+width+" units.");
        System.out.println("the length is "+length+" units.");
        System.out.println("the area is "+area+" units squared.");
        
    }
    
}
