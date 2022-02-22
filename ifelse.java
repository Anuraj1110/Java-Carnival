public class ifelse {
    public static void main(String[] args){
        // 1st if else

        if(1>2)
        System.out.println("1>2");
        else
        System.out.println("2>1");

        // if-else ladder
        
        String str = "Monday";
        if(str == "Monday")
        System.out.println("Today is monday");
        else if(str == "Tuesday")
        System.out.println("Today is Tuesday");
        else if(str == "Wednesday")
        System.out.println("Today is Wensday");

// nested if-else
        int value = 10;

        if(value > 5)
        {
            if(value > 8) // check
            {
                if(value == 10)
                System.out.println("Value is VALID");
                else
                System.out.println("ITs always INVALID");
            }
        }
            
    }
}
