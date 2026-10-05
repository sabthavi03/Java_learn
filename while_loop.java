import java.util.Random;

public class while_loop {

    public static void main(String[] args) {
      /* int j = 1;

        while(j<=10){
            System.out.println(j);
            j++; */  
        
    //Generate a random number unti we get 5

        Random rand = new Random();
        int newnum = 0;

        while(newnum != 5){
            newnum = rand.nextInt(11);
            System.out.println(newnum);
        }
        

        }
    }
    
