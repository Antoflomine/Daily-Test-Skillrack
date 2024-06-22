import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<n;i++){
		    int y=sc.nextInt();
		    if(y%2==0){
		        arr.add(y);
		    }
		}
		//System.out.println(arr);
	System.out.println(lcm(arr));

	}
	public static long lcm(ArrayList<Integer> arr){
	    long res=arr.get(0);
	    for(int i=1;i<arr.size();i++){
	        res=lcm(res,arr.get(i));
	    }
	    return res;
	}
	public static long lcm(long a,long b){
	   // long h=(long)a;
	   // long g=(long)b;
	    return ((a*b)/gcd(a,b));
	}
	public  static long gcd(long a,long b){
	    if(b==0){
	        return a;
	    }
	    return gcd(b,a%b);
	}
}
