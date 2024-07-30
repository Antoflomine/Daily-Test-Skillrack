import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a =nextPrime(n);
		System.out.println(a);

	}
	public static int nextPrime(int n){
	    n++;
	    while(!checkPrime(n)){
	        n++;
	    }
	    return n;
	}
	public static boolean checkPrime(int n){
	    String str=String.valueOf(n);
	    for(char u:str.toCharArray()){
	        if(!isPrime(u)){
	            return false;
	        }
	    }
	    return true;
	}
	public static boolean isPrime(char u){
	    return u=='2' || u=='3' || u=='5' || u=='7';
	}
}
