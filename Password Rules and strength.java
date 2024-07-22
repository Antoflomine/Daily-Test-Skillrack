import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int c=0,C=0,n=0,s=0,l=0;
	    for(int i=0;i<str.length();i++){
	        if(str.length()>=8){
	            l++;
	        
	        if(str.charAt(i)>='a' && str.charAt(i)<='z') {
	            c++;
	        }
	        else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
	            
	            C++;
	            
	        }
	       else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
	            n++;
	        }
	        else{
	            s++;
	        }
	        
	        }
	        else{
	            if(str.charAt(i)>='a' && str.charAt(i)<='z' ){
	                c++;
	            }
	            else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
	                C++;
	            }
	            else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
	                n++;
	            }
	            else{
	                s++;
	            }
	        }
	        
	    }
	   // System.out.println(l+" "+c+" "+C+" "+n+" "+s);
	    if(l>0 && c>0 && C>0 && n>0 && s>0){
	        System.out.print("STRONG");
	    }
	    else if((l>0 && c==0 && C==0 && n==0 && s==0) ||(l>0 && C>0 && c==0 && n==0 && s==0)||(l>0 && c>0 && C==0 && n==0 && s==0)|| (l==0 && (c>0 || C>0 || n>0 || s>0)) ){
	    System.out.print("WEAK");
	    }
	   //  if(l>0 && c>0 && C>0 && n>0 && s>0){
	   //     System.out.println("STRONG");
	   // }
	    else if(l>0 && ((c>0 && C>0 && n>0) || (n>0 && s>0) || (s>0 && c>0 && C>0))){
	        System.out.println("GOOD");
	    }
	    else if(l>0 && ((c>0 && C>0) || n>0 || s>0 )){
	        System.out.println("MEDIUM");
	    }
	    
	}
}
