import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
	//	sc.nextLine();
		String[][] arr=new String[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.next();
		    }
		}
		int a=sc.nextInt();
		int b=sc.nextInt();
		String res=arr[a-1][b-1];
		double l=res.length();
		int w=(int)Math.sqrt(l);
		int q=0;
		for(int i=0;i<w;i++){
		    for(int j=0;j<w;j++){
		        System.out.print(res.charAt(q)+" ");
		        q++;
		    }
		    System.out.println();
		}

	}
}
