import java.util.Scanner;

public class Pay {
    private double hoursWorked;
    private double rateOfPayPerHour;
    private double withholdingRate;
    private double grossPay;
    private double netPay;
    
    public double computeNetPay(double h, double r, double w){
        // Compute Gross Pay
        grossPay = h * r;
        // Produce Net Pay
        return netPay = grossPay - (grossPay * w/100);
    }

    public double computeNetPay(double h, double r){
        withholdingRate = 0.15;
        grossPay = h*r;
        return netPay = grossPay - (withholdingRate*grossPay);
    }

    public double computeNetPay(double h){
        withholdingRate = 0.15;
        rateOfPayPerHour = 5.85;

        grossPay = h * rateOfPayPerHour;
        return netPay = grossPay - (withholdingRate*grossPay);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hours Worked : ");
        double hours1 = sc.nextDouble();

        System.out.println("Computing....");
        Pay p = new Pay();
        
        double netPay1 = p.computeNetPay(hours1);
        System.out.println("netPay = " + netPay1);

        // Two Parameters

        System.out.println("Enter Hours Worked : ");
        double hours2 = sc.nextDouble();
        System.out.println("Enter Rate of Pay per Hour : ");
        double rate2 = sc.nextDouble();

        System.out.println("Computing....");

        double netPay2 = p.computeNetPay(hours2, rate2);
        System.out.println("netPay = " + netPay2);

        // Three Parameters

        System.out.println("Enter Hours Worked : ");
        double hours3 = sc.nextDouble();
        System.out.println("Enter Rate of Pay per Hour : ");
        double rate3 = sc.nextDouble();
        System.out.println("Enter witholding Rate : ");
        double with3 = sc.nextDouble();

        System.out.println("Computing....");

        double netPay3 = p.computeNetPay(hours3, rate3, with3);
        System.out.println("netPay = " + netPay3);

        
    }
}
