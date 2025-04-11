import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int n=s1.length();
		int sum=0;
		for(int i=0;i<n;i++){
		    int a=Character.getNumericValue(s1.charAt(i));
		    int b=Character.getNumericValue(s2.charAt(i));
		    int d=Math.abs(a-b);
		    sum+=Math.min(d,10-d);
		}
        System.out.println(sum);
	}
}
