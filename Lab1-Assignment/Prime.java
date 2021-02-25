public class Prime{

    public static boolean isPrime(int n){
        if(n==1)
            return false;
        for(int i=2 ; i<=n/2 ; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        for(int i=start ; i<=end ; i++){
            if(isPrime(i)){
                System.out.println(i + " is a Prime Number.");
            }
        }
    }
}