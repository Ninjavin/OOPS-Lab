public class Quadrant{
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        if(x>=0 && y>=0)
            System.out.println("First Quadrant");
        else if(x>=0 && y<0)
            System.out.println("Fourth Quadrant");
        else if(x<0 && y<0)
            System.out.println("Third Quadrant");
        else
            System.out.println("Second Quadrant");
    }
}