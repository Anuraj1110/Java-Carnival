import java.util.Scanner;
public class percentagecalculator{
	public static void main(String[] args){
		System.out.println("enter the marks out of 100 ");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 1st subject marks : ");
		double a = s.nextDouble();
		System.out.print("Enter the 2nd subject marks : ");
		double b = s.nextDouble();
		System.out.print("Enter the 3rd subject marks : ");
		double c = s.nextDouble();
		System.out.print("Enter the 3rd subject marks : ");
		double d = s.nextDouble();
		System.out.print("Enter the 4th subject marks : ");
		double e = s.nextDouble(); 
			double total_marks = a+b+c+d+e;
			System.out.println("total marks : " +total_marks);
			double percentage = total_marks/500*100;
			System.out.println("total percentage" +percentage);
}
}