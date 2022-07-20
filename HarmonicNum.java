package Day5Functional;
import java.util.Scanner;
public class HarmonicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,i;
		float sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
a=sc.nextFloat();
for(i=1;i<=a;i++);
	{
		sum=sum+(1/i);
	}
	System.out.println("Harmonic value = "+sum);
}

}
