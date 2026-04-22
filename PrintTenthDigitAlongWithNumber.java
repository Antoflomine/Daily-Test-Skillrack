import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int n=sc.nextInt();
	    int y=n-(Character.getNumericValue(str.charAt(str.length()-1)));
	    String s="";
	    s+=str.substring(0,str.length()-1);
	    s+=String.valueOf(y);
	    s+=str.charAt(str.length()-1);
	    
		System.out.println(s);
	}
}
