import java.util.Scanner;
public class gratestInThree {
    public static void main(String[] args){
        System.out.println("enter three value");
        Scanner s = new Scanner(System.in);
        System.out.print("enter the a value : ");
        int a = s.nextInt();
        System.out.print("enter the b value : ");
        int b = s.nextInt();
        System.out.print("enter the c value : ");
        int c = s.nextInt();

        
            if(a>b){
                if(b>c){
                    // a = 3, b= 2, c=1
                    System.out.println(a+" is greatest");
                    System.out.println(b+" is 2nd greatest");
                    System.out.println(c+" is smallest");
                }//b = 1, c=2, a=3
                else if(a>c){
                    System.out.println(a+" is greatest");
                    System.out.println(c+" is 2nd greatest");
                    System.out.println(b+" is Smallest");
                }
                else{
                    
                    System.out.println(c+" is greatest");
                    System.out.println(a+" is 2nd greatest");
                    System.out.println(b+" is smallest");
                }
            }
            else{// b>a

                if(b>c){
                    if(a>c)
                    {
                        System.out.println(b+" is greatest");
                        System.out.println(a+" is 2nd greatest");
                        System.out.println(c+" is Smallest");
                    }
                    else{
                        System.out.println(b+" is greatest");
                        System.out.println(c+" is 2nd greatest");
                        System.out.println(a+" is Smallest");
                    }
                }
                else{  // c>b
                    System.out.println(c+" is greatest");
                    System.out.println(b+" is 2nd greatest");
                    System.out.println(a+" is Smallest");
                }
            }
            
    
        }
    
}
