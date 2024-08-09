import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	for(int i=0;i<s1.length();i++){
	    int Min=Integer.MAX_VALUE;
	    char q='0';
	    char w=s1.charAt(i);
	    for(int j=0;j<s2.length();j++){
	    int a=((int)s1.charAt(i));
	   int b=((int)s2.charAt(j));
	   
	  
	   if(Math.abs(a-b)<Min){
	       Min=Math.abs(a-b);
	      // w=s1.charAt(i);
	       q=s2.charAt(j);
	       
	       
	   }
	   else if(Math.abs(a-b)==Min){
	       if(s2.charAt(j)<q){
	           q=s2.charAt(j);
	       }
	   }
	  
	   //System.out.println(s1.charAt(i)+" "+s2.charAt(j)+" "+Min);
	    }
	   System.out.print(w+""+q+" ");
	    
	    
	}

	}
}
