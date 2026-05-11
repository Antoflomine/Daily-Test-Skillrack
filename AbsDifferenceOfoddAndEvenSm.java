import java.util.*;

public class Main
{
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int os=0,es=0;
	    for(int i=0;i<str.length();i++){
	        int a=Character.getNumericValue(str.charAt(i));
	        if(a%2==0){
	            es+=a;
	        }
	        else{
	            os+=a;
	        }
	    }
	    
		System.out.println(Math.abs(es-os));
	}
}
