import java.util.Scanner;

public class line_comparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");

		Scanner obj = new Scanner(System.in);
		double x1,y1,x2,y2;
		double length_of_a_line=0.0;

		System.out.println("Enter x1 value : ");
		x1 = obj.nextDouble();

		System.out.println("Enter y1 value : ");
		y1 = obj.nextDouble();

		System.out.println("Enter x2 value : ");
		x2 = obj.nextDouble();

		System.out.println("Enter y2 value : ");
		y2 = obj.nextDouble();

		length_of_a_line = Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)) );

		System.out.println("Length is : " + Math.round(length_of_a_line*100.0)/100.0);
	}
}
