public class Switch{
    public static void main(String args[]){
        String s = args[0];
        char ch = s.charAt(0);
        
        switch(ch){
            case 'a' : System.out.println("Action Movie Fan");  break;
            case 'A' : System.out.println("Action Movie Fan");  break;
            case 'c' : System.out.println("Comedy Movie Fan");  break;
            case 'C' : System.out.println("Comedy Movie Fan");  break;
            case 'd' : System.out.println("Drama Movie Fan");   break;
            case 'D' : System.out.println("Drama Movie Fan");   break;
            default : System.out.println("Invalid Choice"); break;
        }
    }
}