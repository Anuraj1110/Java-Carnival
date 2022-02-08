// Take values of length and breadth of a rectangle from user and check if it is square or not
import java.util.Scanner;
public class checksquare {
    public static void main(String[] args){
        System.out.println("Enter the l and B");
        Scanner s = new Scanner(System.in);
        System.out.print("l = ");
        int a = s.nextInt();
        System.out.print("B = ");
        int b = s.nextInt();
        
        if( a ==  b){
            System.out.println("it is square");
        }else{
            System.out.println("not square");
        }

    } 

    
    
}
