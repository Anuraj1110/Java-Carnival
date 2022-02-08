import java.util.Scanner ;
public class greeting{
    public static void main(String[] args){ 
	System.out.print("Enter your name : ");
	Scanner s = new Scanner(System.in);
	String name = s.next();
	System.out.print("Hello " +  name + " have a good day!");
} 
}