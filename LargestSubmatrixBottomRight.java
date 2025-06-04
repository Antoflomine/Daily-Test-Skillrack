import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		char[][] A = new char[M][N];
		for(int i=0; i<M; i++) {
		    for(int j=0; j<N; j++) {
		        A[i][j] = sc.next().charAt(0);
		    }
		}
		int R = sc.nextInt();
		int C = sc.nextInt();
		char[][] B = new char[R][C];
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        B[i][j] = sc.next().charAt(0);
		    }
		}
		
	   
		int Amin = Math.min(M, N);
		int Bmin=Math.min(R,C);
		int finMin=Math.min(Amin,Bmin);
	
		int a=M-1,b=N-1;
		int c=R-1,d=C-1;
		List<Character> res=new ArrayList<>();
		while(finMin>0){
		    List<Character> arr=new ArrayList<>();
		    for(int i=a;i<M;i++){
		        for(int j=b;j<N;j++){
		            arr.add(A[i][j]);
		           }
		    }
		    finMin--;
		    a--;
		    b--;
		    List<Character> brr=new ArrayList<>();
		    for(int i=c;i<R;i++){
		        for(int j=d;j<C;j++){
		            brr.add(B[i][j]);
		        }
		    }
		    
		    c--;
		    d--;
		    if(arr.equals(brr)){
		        res=arr;
		    }
		}
		double sq=Math.sqrt(res.size());
		int u=0;
		int f=0;
		for(int i=0;i<sq;i++){
		    for(int j=0;j<sq;j++){
		        System.out.print(res.get(u)+" ");
		        u++;
		        f=1;
		    }
		    System.out.println();
		}
		if(f==0){
		    System.out.println("-1");
		}
	//	System.out.println(res);
	}
}
