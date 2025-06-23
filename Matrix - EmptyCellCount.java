import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int q=sc.nextInt();
		int[] X=new int[q];
		int[] Y=new int[q];
		for(int i=0;i<q;i++){
		   X[i]=sc.nextInt();
		   Y[i]=sc.nextInt();
		}
		int[][] arr=new int[r][c];
	    for(int xy=0;xy<q;xy++){
	        int count=0;
	        for(int i=0;i<r;i++){
	            //int count=0;
	            
	            for(int j=0;j<c;j++){
	                if(i==X[xy]-1){
	                    arr[i][j]=1;
	                    
	                }
	                if(j==Y[xy]-1){
	                    arr[i][j]=1;
	                    
	                }
	                if(arr[i][j]==1){
	                    count++;
	                }
	               // System.out.print(arr[i][j]);
	            }
	        //System.out.println();
	      
	        }
	       // System.out.println();
	       System.out.println((r*c)-count);
	    }
		

	}
}
