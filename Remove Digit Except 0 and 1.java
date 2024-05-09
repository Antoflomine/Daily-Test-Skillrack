import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String N=sc.nextLine();
		
		String s="";
		for(int i=0;i<N.length();i++){
		    if(N.charAt(i)=='0' || N.charAt(i)=='1'){
		        s+=N.charAt(i);
		    }
		}
		if(s.length()==0){
		    System.out.println("-1");
		    return;
		}
		System.out.println(Integer.parseInt(s,2));
		

	}
}
