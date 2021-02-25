import java.util.Scanner;

public class Triangle{

    int base;
    int height;

    Triangle(){
        base = 0;
        height = 0;
    }

    Triangle(int a, int b){
        base = a;
        height = b;
    }

    double getArea(){
        if(base <= 0 || height <= 0)
            return -1;
        return (0.5 * base * height);
    }

    void show(){

        if(getArea() == -1){
            System.out.println("Base/Height should be greater than 0");
            return;
        }
        System.out.println("Base is " + base);
        System.out.println("Height is " + height);
        System.out.println("Area is " + getArea());
    }

    static void compare(Triangle t1, Triangle t2){
        if(t1.getArea() == -1 || t2.getArea() == -1){
            System.out.println("Cannot compare one of the triangles is invalid");
        }
        else if(t1.getArea() > t2.getArea())
            System.out.println("Triangle 1 is greater.");
        else if(t1.getArea() < t2.getArea())
            System.out.println("Triangle 2 is greater.");
        else
            System.out.println("Triangle 1 and Triangle 2 are equal.");
    }

    public static void main(String args[]){

        System.out.println("++++++++++MENU++++++++++");
        System.out.println("Enter 1 for getting area of a single triangle");
        System.out.println("Enter 2 for comparing two triangles");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice){
            case 1 : System.out.print("Enter Base : ");
        
            int base = sc.nextInt();
            System.out.print("Enter Height : ");
            int height = sc.nextInt();
    
            Triangle t = new Triangle(base, height);
            System.out.println(t.getArea());
            
            break;

            case 2 : System.out.println("Enter Base of Triangle 1 : ");
            int b1 = sc.nextInt();
            System.out.println("Enter Height of Triangle 1 : ");
            int h1 = sc.nextInt();

            Triangle t1 = new Triangle(b1, h1);
            t1.show();

            System.out.println("Enter Base of Triangle 2 : ");
            int b2 = sc.nextInt();
            System.out.println("Enter Height of Triangle 2 : ");
            int h2 = sc.nextInt();

            Triangle t2 = new Triangle(b2, h2);
            t2.show();
            
            compare(t1, t2);

            break;

            default: System.out.println("Invalid Choice"); break;

        }
                
    }
}

