import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int n=sc.nextInt();
	    sc.nextLine();
	   StringBuilder a=new StringBuilder();
	   a.append(str);
	    for(int i=0;i<n;i++){
	        String y=sc.nextLine();
	       // System.out.print(y);
	       
	        if(y.charAt(0)=='S' && y.charAt(2)=='+'){
	           
	            a.append(str.charAt(str.length()-1));
	            
	        }
	        else if(y.charAt(1)=='+' && y.charAt(2)=='1'){
	       
	            a.append(a);
	        }
	        else if(y.charAt(0)=='+' ){
	           a.insert(0,str.charAt(0));
	        }
	        System.out.println(a);
	    }
	   

	}
}
