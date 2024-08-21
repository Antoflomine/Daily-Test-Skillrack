import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
	//	String[] arr=new String[n];
	int c=0;
		for(int i=1;i<=n;i++){
		    String s=Integer.toBinaryString(i);
		    int l=s.length();
		  for(int j=0;j<=str.length()-l;j++){
		    
		      String y=str.substring(j,j+l);
		      if(y.equals(s)){
		          c++;
		          break;
		          
		      }
		      
		  }
		    
		}
		if(c==n){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	//	System.out.println(c);
	//	System.out.println(Arrays.toString(arr));
	

	}
}
