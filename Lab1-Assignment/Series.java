import java.lang.Math;

public class Series {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        int power = Integer.parseInt(args[1]);
        int result=0;
        for(int i=0 ; i<=power ; i++){
            result += Math.pow(num, i);
        }
        System.out.println(result);
    }
}
