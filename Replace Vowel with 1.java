import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int c=0;
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z'){
		        c++;
		    }
		}
		String res="";
		int w=0;
		if(c!=str.length()){
		    System.out.println("Invalid");
		    return;
		}
		else{
		    for(int i=0;i<str.length();i++){
		        if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='o' || str.charAt(i)=='U' || str.charAt(i)=='u'){
		            res+='1';
		            w++;
		        }
		        else{
		            res+=str.charAt(i);
		        }
		    }
		}
		System.out.println(res+" "+w);

	}
}
