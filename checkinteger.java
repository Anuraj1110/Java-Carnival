//Write a Java program to detect whether a number entered by the user is an integer or not.	
import java.util.Scanner;
public class checkinteger{
      public static void main(String[] args){
	System.out.println("Enter a Number : ");
	Scanner s = new Scanner(System.in);
	System.out.println(s.hasNextInt());
}
}
 