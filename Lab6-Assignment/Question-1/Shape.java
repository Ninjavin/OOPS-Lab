public class Shape {
    public String color = "red";
    public Shape(){        
        System.out.println("Default Constructor of Shape");        
    }  
    public Shape(String color){
        this.color = color;
    }
    public void printDesc(){
        System.out.println("This shape is of color " + this.color);
    }
}

class Rectangle extends Shape{
    public double length=0;
    public double breadth=0;
    
    public Rectangle(double length, double breadth, String color){
        super(color);
        this.length = length;
        this.breadth = breadth;        
    }
    
    //overriding printDesc()
    public void printDesc(){
        double area = this.length * this.breadth;
        System.out.println("This rectangle shape has a length of " + this.length + ", breadth of " + this.breadth + ", area of " + area + ", color of " + this.color + ".");
        
    }    
}
class Circle extends Shape{
    public double radius=0;
        
    public Circle(double radius,String color){
        super(color);
        this.radius = radius;
    }
    
    //overriding printDesc()
    public void printDesc(){
        double area = 3.14 * this.radius * this.radius;
        System.out.println("The circle has a radius of " + this.radius + ", area of " + area + ", color of " + this.color + ".");        
    }    
}

class Square extends Rectangle{    
    public Square(double side,String color){
        super(side,side,color);           
    }
    
    //overriding printDesc()
    public void printDesc(){
        double area = this.length * this.breadth;
        System.out.println("The square has a side of " + this.length + ", area of " + area + ", color of " + this.color + ".");        
    }    
}
