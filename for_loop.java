import java.util.Scanner;

public class for_loop {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int a = scan.nextInt();
        System.out.println("Enter number 2 :");
        int b = scan.nextInt();

        if(a<b)
        {
            for(int i=a;i <= b; i=i+1)
        {
            System.out.println(i);
        }
        }
        else{
            for(int i=a;i >= b; i=i-1)
        {
            System.out.println(i);
        }

        }
        
        
    }
    
}
