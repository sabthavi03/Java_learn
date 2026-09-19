import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] array = new int[size];

        for(int i=0; i<size; i++)
        {
            array[i] = scan.nextInt();
        }

        
        //int num = Math.ceil(size/2);
        //System.out.println(array[num-1]);

    }
    
}
