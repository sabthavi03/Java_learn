import java.util.Scanner;

public class nested_if {
    public static void main(String args[])
    {
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your salary :");
       int salary = scan.nextInt();
       System.out.println("Enter your age :");
       int age = scan.nextInt();

       if((salary >= 20000) || (age <= 25))
       {
        System.out.println("Enter your loan amount :");
        int loan = scan.nextInt();
        if(loan <= 50000)
        {
            System.out.println("You are eligible for the loan");
        }
        else
        {
            System.out.println("The maximum loan amount is 50000");
        }
       }
       else
       {
        System.out.println("You are not eligible for the loan");
       }

    }
}


    
    

