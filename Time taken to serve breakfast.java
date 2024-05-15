import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String a=sc.nextLine();
		int sum=0,k=0,l=0;
		if(a.length()==1){
		    for(int j=0;j<str.length();j++){
		        if(a.charAt(0)==str.charAt(j)){
		            sum+=j;
		        }
		    }
		}
		else{
		for(int i=0;i<a.length()-1;i++){
		    for(int j=0;j<str.length();j++){
		       
		     
		        if(a.charAt(i)==str.charAt(j) ){
		            if(i==0){
		                sum+=j;
		            }
		            
		          k=j;
		            
		        }
		        if(a.charAt(i+1)==str.charAt(j)){
		            l=j;
		        }
		    }
		        int y=Math.abs(k-l);
		        sum=sum+y;

	//	System.out.println(k+" "+l);
		}
		}
		System.out.println(sum);
		

	}
}
