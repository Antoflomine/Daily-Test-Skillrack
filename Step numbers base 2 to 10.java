import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=0;
		for(int i=2;i<=10;i++){
		    String a=Integer.toString(n,i);
		  //  System.out.println(a);
		  int c=0;
		  for(int j=0;j<a.length()-1;j++){
		      if(Math.abs(a.charAt(j)-a.charAt(j+1))==1){
		          c++;
		      }
		  }
		  if(c==a.length()-1){
		      System.out.println(a);
		      f=1;
		  }
		}
		if(f==0){
		    System.out.println("-1");
		}

	}
}
