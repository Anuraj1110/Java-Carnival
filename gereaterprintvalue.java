import java.util.Scanner;
public class gereaterprintvalue {
    public static void main(String[] args){
        System.out.println("enter two value");
        Scanner s = new Scanner(System.in);
        System.out.print("enter the a value : ");
        int a = s.nextInt();
        System.out.print("enter the b value : ");
        int b = s.nextInt();
            if(a >= b){
                System.out.println("a is greater than b : " + a);
            }else{
                System.out.println("b is greater than a : " +b);
            }
    
        }
    
}
