import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		int[][] brr=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
	    rearrangeMat(n,arr);
	}
	public static void rearrangeMat(int n,int[][] arr){
	    int[] or=arr[0];
	   // System.out.println(Arrays.toString(or));
	    int[][] col=new int[n][n];
	    for(int i=0;i<n;i++){
	        int r=or[i]-1;
	        for(int j=0;j<n;j++){
	            col[j][i]=arr[r][j];
	        }
	    }
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            System.out.print(col[i][j]+" ");
	        }
	        System.out.println();
	    }
	    //System.out.print(Arrays.deepToString(col));
	}
}
