import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    sc.nextLine();
	    String[] arr=new String[n];
	    int sm=0;
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextLine();
	        sm+=Character.getNumericValue(arr[i].charAt(arr[i].length()-2));
	    }
	    
		System.out.println(sm);
	}
}
