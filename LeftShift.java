import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(); // 5
	    int[] arr=new int[n]; // 10 20 30 40 50 
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int r=sc.nextInt(); // 8  // 8 5 -> 3
	    if(r>n){
	        r=r%n; 
	    }
	    // 30 40 50 10 20
	    for(int i=r;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }
	    for(int i=0;i<r;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
}
