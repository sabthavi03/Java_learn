import java.util.Scanner;

public class array1 {

    public static void main(String[] args) {
        
        int[] score = new int[5];

        Scanner scan = new Scanner(System.in);

         for(int i = 0; i<5 ; i++)
        {
            score[i] = scan.nextInt();
        }
        
        System.out.println("Printing all your scores :");
        for(int i = 0; i<5 ; i++)
        {
            System.out.println(score[i]);
        }


    }
    
}
