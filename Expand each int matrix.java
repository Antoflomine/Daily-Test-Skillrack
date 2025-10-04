import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ro=sc.nextInt();
		int co=sc.nextInt();
		sc.nextLine();
		int[][] in=new int[ro*2][co*2];
		
		for(int i=0;i<ro;i++){
		    for(int j=0;j<co;j++){
		        int n=sc.nextInt();
		        String s=String.format("%04d",n);
		        
		        int a=s.charAt(0)-'0';
		        int b=s.charAt(1)-'0';
		        int c=s.charAt(2)-'0';
		        int d=s.charAt(3)-'0';
		        
		        in[i*2][j*2]=a;
		        in[i*2][j*2+1]=b;
		        in[i*2+1][j*2]=c;
		        in[i*2+1][j*2+1]=d;
		    }
		}
		for(int i=0;i<ro*2;i++){
		    for(int j=0;j<co*2;j++){
		        System.out.print(in[i][j]+" ");
   
		    }
		    System.out.println();
		}

		
		
		

	}
}
