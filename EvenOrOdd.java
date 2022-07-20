package Day5Functional;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner EoO=new Scanner(System.in);
System.out.println("Enter a number : ");
int num=EoO.nextInt();

if(num%2==0)
	System.out.println(num + " is an even number");
else
	System.out.println(num + " is an odd number");
	}

}
