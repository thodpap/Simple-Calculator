import java.util.Scanner;

//long INF = 100000000000;

public class Calculator{
	private static long INF = 100000000;
	public static double add(double a,double b){
		return a + b;
	}
	public static double sub(double a,double b){
		return a - b;
	}
	public static double mul(double a,double b){
		return a * b;
	}
	public static double div(double a,double b){
		if(b == 0) return INF;
		return a / b;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("Give simple expression:");
			double a = scan.nextDouble();
			char e = scan.next().charAt(0);
			double b = scan.nextDouble();
			double result = 0.0;
			switch(e){
				case '+': result = add(a,b); break;
				case '-': result = sub(a,b); break;
				case '*': result = mul(a,b); break;
				case '/': result = div(a,b); break;
				default: System.out.println("Wrong exrpession");
					 break;
			}
			System.out.println(" = " + result);
		}
	}
}
