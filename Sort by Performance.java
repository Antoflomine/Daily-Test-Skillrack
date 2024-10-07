import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] s=new int[n];
		int[] e=new int[n];
		for(int i=0;i<n;i++){
		    s[i]=sc.nextInt();
		   
		}
		for(int i=0;i<n;i++){
		    e[i]=sc.nextInt();
		}
		int[] p=new int[n];
		for(int i=0;i<n;i++){
		    p[i]=s[i]*e[i];
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-1;j++){
		        if(p[j]<p[j+1]){
		            int t=p[j];
		            int te=e[j];
		            int ts=s[j];
		            p[j]=p[j+1];
		            e[j]=e[j+1];
		            s[j]=s[j+1];
		            p[j+1]=t;
		            e[j+1]=te;
		            s[j+1]=ts;
		        }
		        if(p[j]==p[j+1]){
		            if(s[j]<s[j+1]){
		                int t=p[j];
		                int te=e[j];
		                int ts=s[j];
		                p[j]=p[j+1];
		                e[j]=e[j+1];
		                s[j]=s[j+1];
		                p[j+1]=t;
		                e[j+1]=te;
		                s[j+1]=ts;
		            }
		        }
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(s[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++){
		    System.out.print(e[i]+" ");
		}
		//System.out.println(Arrays.toString(s));

	}
}
