import java.util.Scanner;

public class line_comparison {

	public double length_of_a_line(){

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
		return Math.round(length_of_a_line*100.0)/100.0;
	}


	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");

		line_comparison lc = new line_comparison();
		System.out.println("Enter First Line Co-ordinates : ");
		double first_line_length = lc.length_of_a_line();
		System.out.println("Length of first line is : " + first_line_length);

		System.out.println("Enter Second Line Co-ordinates : ");
		double second_line_length = lc.length_of_a_line();
		System.out.println("Length of Second line is : " + second_line_length);

		String first=Double.toString(first_line_length);
		String second=Double.toString(second_line_length);

		System.out.println("Are both lines equal? ");
		System.out.println(first.equals(second));
	}
}
