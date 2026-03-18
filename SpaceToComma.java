import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    StringBuilder s=new StringBuilder();
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)==' '){
	            s.append(",");
	        }
	        else{
	            s.append(str.charAt(i));
	        }
	    }
		System.out.println(s);
	}
}
