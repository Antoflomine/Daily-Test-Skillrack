import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String res="";
	    ArrayList<Integer> in=new ArrayList<>();
	    ArrayList<Character> ch=new ArrayList<>();
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u'){
	            in.add(i);
	            ch.add(str.charAt(i));
	        }
	    }
	    int s=0,e=in.get(0);
	    for(int i=0;i<in.size();i++){
	        e=in.get(i);
	        for(int k=s;k<e;k++){
	        res+=ch.get(i);
	        }
	        s=e;

	    }
	    if(res.length()<str.length()){
	        res+=str.substring(in.get(in.size()-1),str.length());
	    }
	    
	    
		System.out.println(res);
				


	}
}
