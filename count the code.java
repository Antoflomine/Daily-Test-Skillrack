import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		char[][] arr=new char[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.next().charAt(0);
		    }
		}
		int count=0;
		char[] t={'c','o','d','e'};
		Arrays.sort(t);
		String s=new String(t);
	//System.out.println(s);
		for(int i=0;i<r-1;i++){
		    
		  
		    for(int j=0;j<c-1;j++){
		        String a="";
		        a+=arr[i][j];
		        a+=arr[i+1][j];
		        a+=arr[i+1][j+1];
		        a+=arr[i][j+1];
		    
		   // System.out.println(a);
		  
		   char[] m=a.toCharArray();
		   Arrays.sort(m);
		   String fin=new String(m);
		   System.out.println(fin);
		   if(fin.equals(s)){
		       count++;
		   }
		  // System.out.println(Arrays.toString(m));
		    }
		}
		System.out.println(count);

	}
}
