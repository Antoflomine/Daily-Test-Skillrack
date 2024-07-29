import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		int y=n;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=y;
		        y++;
		        
		    }
		}
		int[][] rev=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        rev[j][i]=arr[i][j];
		    }
		}
	    
		for(int i=0;i<n;i++){
		   
		       if(i%2==1){
		           reverseRow(rev[i]);
		       }
		   
		    
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(rev[i][j]+" ");
		    }
		    System.out.println();
		}
		

	}
	public static void reverseRow(int[] arr){
	    int l=0,r=arr.length-1;
	   while(l<r){
	       int t=arr[l];
	       arr[l]=arr[r];
	       arr[r]=t;
	       l++;
	       r--;
	   }
	}
}
