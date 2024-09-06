import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    int n=str.length();
	    int l=0;
	    for(int i=1;i<str.length();i++){
	        if(str.substring(0,i).equals(str.substring(n-i))){
	            l=i;
	        }
	    }
	    if(l==0){
	        System.out.println("-1");
	    }
	    else{
            System.out.println(l);
        }
	}
}
