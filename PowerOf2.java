package Day5Functional;
import java.util.Scanner;
public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b, e;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the base: ");  
		b = sc.nextInt();  
		System.out.print("Enter the exponent: ");  
		e = sc.nextInt();  
		double power = Math.pow(b, e);  
		System.out.println(b +" to the power " +e + " is: "+power);
	}

}
