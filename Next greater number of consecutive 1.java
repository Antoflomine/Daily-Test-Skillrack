import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(check1(n));


	}
	public static int check1(int n){
	    while(true){
	        String g=Integer.toBinaryString(n);
	    if(!hasCon1(g)){
	        return n;
	    }
	    n++;
	    }
	}
	public static boolean hasCon1(String g){
	    
	    for(int i=0;i<g.length()-1;i++){
	        if(g.charAt(i)=='1' && g.charAt(i+1)=='1'){
	            return true;
	        }
	    }
	        return false;
	    
	}
	
}
