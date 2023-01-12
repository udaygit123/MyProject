package project1package;
import java.util.Scanner;

public class Calculator {
	
	
	public static int sum(int m, int n) {
		int sum=m+n;
		return sum;
	}
	public static int sub(int m, int n) {
		int sub=m-n;
		return sub;
	}
	public static int mul(int m, int n) {
		int mul=m*n;
		return mul;
	}
	public static int div(int m, int n) {
		int div=m/n;
		return div;
	}
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter two numbers");
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				System.out.println("Entered two numbers:"+n1+" "+n2);
				// creating object 
				Calculator cal =new Calculator();
				// calling method
				int addition=cal.sum(n1,n2);
				System.out.println("sum of two numbers is:" + addition+"\n");
				int substraction=cal.sub(n1,n2);
				System.out.println("substraction of two numbers is:" + substraction+"\n");
				int multiplication=cal.mul(n1,n2);
				System.out.println("multiply of two numbers is:" + multiplication+"\n");
				int division1 =cal.div(n1,n2);
				System.out.println("div of two numbers is:" + division1+"\n");
				
	}}


	
