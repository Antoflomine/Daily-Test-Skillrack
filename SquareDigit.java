import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=String.valueOf(n);
		String r="";
		for(int i=0;i<s.length();i++){
		    int y=Character.getNumericValue(s.charAt(i));
		    if(y%2==0){
		        r+=y*y;
		    }
		    else{
		        r+='-';
		        r+=y*y;
		    }
		}
		System.out.println(r);
	
		
	
	}
}
