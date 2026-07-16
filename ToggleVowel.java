import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String res="";
	    for(int i=0;i<s.length();i++){
	        if(i%2==0){
	            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
	                res+=Character.toUpperCase(s.charAt(i));
	            }
	            else if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
	                res+=Character.toLowerCase(s.charAt(i));
	            }
	            else{
	                res+=s.charAt(i);
	            }
	        }
	        else{
	             res+=s.charAt(i);
	        }
	    }
		System.out.println(res);
	}
}
