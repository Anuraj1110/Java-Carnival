import java.util.Scanner; 
public class markscalculated

{
    public static void main(String[] args){
        System.out.println("Enter the marks out of 100 ");
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the 1st subject marks : ");
      double a = S.nextDouble();
        System.out.print("Enter the 2nd Subject Marks : ");
      double b = S.nextDouble();
        System.out.print("Enter the 3rd subject marks : ");
      double c = S.nextDouble();
        System.out.print("Enter the 4th subject marks : ");
      double d = S.nextDouble();
        System.out.print("Enter the 5th subject marks : ");
      double e = S.nextDouble();

    //   double total_marks = a+b+c+d+e ;
    //            System.out.println("total_marks : " +total_marks);
          double percentage = (a+b+c+d+e)/500*100 ;
            System.out.println("percentage : " +percentage);


    }
}
