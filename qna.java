import java.util.Scanner;

public class qna {
    public static void main(String args[])

    {
        Scanner info = new Scanner(System.in);
        String name = info.nextLine();
        int age = info.nextInt();
        info.nextLine();
        String address = info.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("You are "+age+" years old.");
        System.out.println("You live in "+address);

    }
    
}
