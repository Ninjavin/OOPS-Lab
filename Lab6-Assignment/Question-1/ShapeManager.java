import java.util.*;

public class ShapeManager {
    public void manageShape(Shape shape){
        shape.printDesc();
    }    
    
    public static void main(String[] args){
        ShapeManager sm = new ShapeManager();
        
        Scanner sc = new Scanner(System.in);                
        System.out.println("Enter color: ");
        String color = sc.next();
        
        Shape shape = new Shape(color);
        sm.manageShape(shape);
        
        System.out.println("Enter length: ");
        double length = Double.parseDouble(sc.next());
        System.out.println("Enter breadth: ");
        double breadth = Double.parseDouble(sc.next());
        System.out.println("Enter color: ");
        String colorRect = sc.next();
        
        Rectangle rect = new Rectangle(length, breadth, colorRect);
        sm.manageShape(rect);
        
        System.out.println("Enter side: ");
        double side = Double.parseDouble(sc.next());        
        System.out.println("Enter color: ");
        String colorSq = sc.next();
        
        Square sq = new Square(side,colorSq);
        sm.manageShape(sq);
        
        System.out.println("Enter radius: ");
        double radius = Double.parseDouble(sc.next());        
        System.out.println("Enter color: ");
        String colorCircle = sc.next();
        
        Circle c = new Circle(radius, colorCircle);
        sm.manageShape(c);
    }    
}

