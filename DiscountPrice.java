import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    
	            int total = x * y;
        double finalPrice;

	     if (x >= 2 && x <= 4) {
            finalPrice = total - (total * 10.0 / 100);
        } 
        else if (x == 5) {
            finalPrice = total - (total * 20.0 / 100);
        } 
        else if (x > 5) {
            finalPrice = total - (total * 50.0 / 100);
        } 
        else {
            finalPrice = total;
        }

        System.out.println((int) finalPrice);
	}
}
