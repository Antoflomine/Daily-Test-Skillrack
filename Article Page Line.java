import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		double m=y*z;
		double u=(float)x/m;
	    int res=(int)Math.ceil(u);
	    int c=0;
	    for(int i=0;i<res-1;i++){
	        c+=y;
	        x-=m;
	        
	    }
	    double k=(float)x/(float)z;
	    c+=(int)Math.ceil(k);
	    System.out.println(res);
		System.out.println(c);

	}
}
