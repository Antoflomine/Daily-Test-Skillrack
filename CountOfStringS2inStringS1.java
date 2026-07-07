import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	    int c=0;
	    for(int i=0;i<=s1.length()-s2.length();i++){
	        String a=s1.substring(i,i+s2.length());
	        if(a.equals(s2)){
	            c++;
	        }
	    }
		System.out.println(c);
	}
}
