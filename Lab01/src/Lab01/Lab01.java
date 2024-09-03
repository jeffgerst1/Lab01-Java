package Lab01;
import java.util.Random;

public class Lab01{
    public static void main(String[] args) {
        
    	char[] nucleotides = {'A', 'C', 'G', 'T'};
        
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            
        	
        	char first = nucleotides[random.nextInt(nucleotides.length)];
            char second = nucleotides[random.nextInt(nucleotides.length)];
            char third = nucleotides[random.nextInt(nucleotides.length)];

            String threeMer = "" + first + second + third;
            System.out.println(threeMer);
            
            
        
        }
        int count if threeMer == threeMer 
       
    }


