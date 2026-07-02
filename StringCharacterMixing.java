import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	    
	    for(int i=0;i<s1.length();i++){
	        String r=s2.substring(0,i)+s1.charAt(i)+s2.substring(i+1);
	        System.out.print(r+" ");
	    }
	
	}
}
