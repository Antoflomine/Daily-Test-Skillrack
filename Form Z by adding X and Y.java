import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int f=0;
		for(int i=0;i<=z/x;i++){
		    for(int j=0;j<=z/y;j++){
		        if((x*i)+(y*j)==z){
		            f=1;
		        }
		    }
		}
		if(f==1){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}

	}
}
