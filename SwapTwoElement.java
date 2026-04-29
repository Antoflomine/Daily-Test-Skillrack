import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        if((i+1)==a){
	            int t=arr[i];
	            arr[i]=arr[b-1];
	            arr[b-1]=t;
	        }
	    }
		System.out.println(Arrays.toString(arr));
	}
}
