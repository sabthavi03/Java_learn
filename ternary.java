import java.util.Scanner;

public class ternary {
    public static void main(String args[])
    {
        //System.out.println(false?"Yes":"No");

        /* 
         String result = (true)?"Yes":"No";
        System.out.println(result);
        */
       
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter num1 :");
        int a = scan.nextInt();
         System.out.println("Enter num2 :");
        int b = scan.nextInt();

        String result = (a>b)?(a+" is greater than "+b):(b+" is greater than "+a);

        System.out.println(result);
    
}
}