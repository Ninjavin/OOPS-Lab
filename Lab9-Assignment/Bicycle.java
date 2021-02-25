import java.util.*;

public class Bicycle{
	private int gear, speed;

	public Bicycle(int gear,int speed){
		this.gear = gear;
		this.speed = speed;
	}

	public void putBrakes(int decrement){
		speed -= decrement;
		if(speed <= 0)
			System.out.println("Speed is too slow for the Bicycle to move\n");
	}

	public String toString(){
		return "Gear value is: " + this.gear + " & Speed is: " + this.speed;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gear value : ");
		int g = sc.nextInt();
		System.out.println("Enter speed value : ");
		int s = sc.nextInt();
		System.out.println("Enter seat height value : ");
		int h = sc.nextInt();
		MountainBike b = new MountainBike(g,s,h);
		System.out.println(b.toString());
		b.putBrakes(20);
		System.out.println("After breaks " + b.toString());
	}
}