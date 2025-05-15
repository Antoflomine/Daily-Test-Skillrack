import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int n=s1.length()<s2.length()?s1.length():s2.length();
		String y=s1.length()>s2.length()?s1:s2;
	//	System.out.println(n);
		for(int i=0;i<n;i++){
		    char a=s1.charAt(i);
		    char b=s2.charAt(i);
		    if(a==' ' && b==' '){
		        System.out.println("**");
		    }
		    else if(b==' '){
		        System.out.println(a+"*");
		    }
		    else if(a==' '){
		        System.out.println(b+"*");
		    }
		    else{
		   System.out.println(a+""+b);
		    }
		}
		String r=y.substring(n);
		for(int i=0;i<r.length();i++){
		    if(r.charAt(i)==' '){
		        System.out.print("*");
		    }
		    else{
		        System.out.print(r.charAt(i));
		    }
		    System.out.println("*");
		}
// 		System.out.println(r);

	}
}
