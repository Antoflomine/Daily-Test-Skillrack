import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		ArrayList<String> li=new ArrayList<>();
		Set<Long> s=new TreeSet<>();
		for(int i=0;i<str.length();i++){
		    
		    for(int j=i+1;j<=str.length();j++){
		        String y=str.substring(i,j);
		        long r=Long.parseLong(y,2);
		        if(r>0 && (r &(r-1))==0){
		            s.add(r);
		        }
		    }
		  
		}
	
		for(long h:s){
		System.out.print(h+" ");
		}
		

	}
}
