import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		        
		    }
		}
		
		
	    for(int i=0;i<=n-3;i=i+3){
	        for(int j=0;j<=n-3;j=j+3){
	            ArrayList<Integer> brr=new ArrayList<>();
	            for(int k=i;k<i+3;k++){
	                for(int l=j;l<j+3;l++){
	                    brr.add(arr[k][l]);
	                }
	            }
	            Collections.sort(brr);
	          //System.out.println(brr);
	        
	           for(int u=0;u<9;u++){
	               if(brr.get(8)==9){
	               if((u)!=brr.get(u)){
	                   System.out.print(u+" ");
	                   break;
	               }
	               }
	               else{
	                   System.out.print(9+" ");
	                   break;
	                   
	               }
	               
	               
	           }
	          
	        
	        }
	    }

	}
}
