/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author DT
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory factory= ShapeFactory.createInstance();
        
        Shape rectangle= factory.createShape(ShapeType.rectangle);
        rectangle.setBrush("Hương");
        rectangle.setFrame("Gỗ các cạnh lần lượt là 5,4,5,4 ");
        rectangle.setPaper("A3");
       
        
        Shape circle= factory.createShape(ShapeType.circle);
        circle.setBrush("Sồi");
        circle.setFrame("Gỗ đường kính 5d");
        circle.setPaper("A4");
        
        System.out.println("Loại gỗ 1:\n"+rectangle.draw()+"\n");
        System.out.println("Loại gỗ 2:\n"+circle.draw()+"\n");
    }
    
}
