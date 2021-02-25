public class Fibonacci {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        int first = 0;
        int second = 1;
        int next;

        if(n==1){
            System.out.println("0");
        }else if(n==2){
            System.out.println("0 1");
        }else{
            System.out.print("0 1 ");
            for(int i=2 ; i<n ; i++){
                next = first + second;
                
                first = second;
                second = next;
                System.out.print(next + " ");
            }
            System.out.print("\n");
        }
        
    }
}
