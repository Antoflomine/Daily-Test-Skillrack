import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int u=0;
		int y=0,k=r-1,e=c-1,h=r,o=1,w=r-2,q=c;
		int x=c/2;
		while(true){
		    u++;
		ArrayList<Integer> brr=new ArrayList<>();
		if(y==c || k==-1){
		    return;
		}
		for(int i=0;i<h;i++){
		    brr.add(arr[i][y]);
		}
		y++;
		h--;
		
		for(int i=o;i<q;i++){
		    brr.add(arr[k][i]);
		}
		k--;
		o++;
		q--;
		for(int i=w;i>=0;i--){
		    brr.add(arr[i][e]);
		}
		e--;
		w--;
	
		  
		   for(int z:brr){
		       System.out.print(z+" ");
		   }
		   System.out.println();
		   if(brr.get(0)==arr[0][x-1] && brr.get(brr.size()-1)==arr[0][x]){
		      return;
		   }
		 
		   
		}

	}
}
