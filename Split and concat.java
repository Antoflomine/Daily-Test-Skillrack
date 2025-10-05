import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String[] arr=s.split(" ");
	    int n=arr.length;
	    System.out.print(arr[0].substring(0,arr[0].length()/2));
	   
	    for(int i=0;i<arr.length-1;i++){
	        String a=arr[i];
	        String b=arr[i+1];
	        System.out.print(a.substring(a.length()/2,a.length()));
	        System.out.print(b.substring(0,b.length()/2)+" ");
	        
	        
	    }
	    System.out.print(arr[n-1].substring(arr[n-1].length()/2,arr[n-1].length()));
	
	}
}
