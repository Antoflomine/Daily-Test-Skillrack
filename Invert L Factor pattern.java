import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nn=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=1;i<=nn;i++){
		    if(nn%i==0){
		        arr.add(i);
		    }
		}
		int n=arr.size();
		int[][] res=new int[n][n];
		for(int k=n-1;k>=0;k--){
		for(int i=0;i<n;i++){
		   res[i][k]=arr.get(k);
		}
		for(int j=0;j<n;j++){
		    res[k][j]=arr.get(k);
		}
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(res[i][j]+" ");
		    }
		    System.out.println();
		}

	}
}
