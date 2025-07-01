import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    
		}
		
		for(int i=0;i<n;i++){
		    if(arr[i]>=0){
		        int y=1;
		        y*=(arr[i]*arr[arr[i]-1]);
		        System.out.print(y+" ");
		    }
		    else{
		        int y=1;
		        int j=Math.abs(arr[i]);
		        //System.out.println(j);
		        y*=(arr[i]*arr[n-j]);
		        System.out.print(y+" ");
		    }
		}

	}
}
