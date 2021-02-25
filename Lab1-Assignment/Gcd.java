public class Gcd{

    public static int gcd(int n1, int n2){
        if(n2 != 0)
            return gcd(n2, n1%n2);
        else
            return n1;
    }
    public static void main(String args[]){
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.println(gcd(n1, n2));
    }
}