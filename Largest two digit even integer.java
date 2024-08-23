import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int max=0;
	    for(int i=0;i<str.length();i++){
	        
	        for(int j=0;j<str.length();j++){
	            String g="";
	            if(i!=j){
	                g+=str.charAt(i);
	                g+=str.charAt(j);
	            }
	            if(!g.equals("")){
	            int y=Integer.parseInt(g);
	            if(y%2==0 && max<y){
	                max=y;
	            }
	            }
	           // System.out.println(g);
	        }
	    }
	    System.out.println(max);

	}
}
