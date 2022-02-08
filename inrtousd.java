import java.util.Scanner;
public class inrtousd{
     public static void main(String[] args){
	System.out.println("convert inr to dollar");
	Scanner s = new Scanner(System.in);
	System.out.print("enter rupees : ");
	float a = s.nextFloat();
	float Dollar = (a) * 0.013f ;
	System.out.println("Dollar " + Dollar);
}
}