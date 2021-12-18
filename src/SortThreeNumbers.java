import java.util.Scanner;

public class SortThreeNumbers {

	public static void main(String[] args) {
		System.out.println("Enter three numbers...");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int max;
		int middle;
		int min;
		max=(Math.max(num3,(Math.max(num1,num2))));
		min=-1*(Math.max(-num3, (Math.max(-num1, -num2))));
		middle=(num1+num2+num3) -(max+min);
		System.out.println("Max is: " + max);
		System.out.println("Middle is: " + middle);
		System.out.println("Min is: " + min);
	}

}
