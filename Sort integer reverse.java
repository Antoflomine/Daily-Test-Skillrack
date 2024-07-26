import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String[] arr=new String[n];
	    String[] r=new String[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.next();
	        StringBuilder sb=new StringBuilder(arr[i]).reverse();
	        r[i]=sb.toString();
	    }
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-1;j++){
	            int a=Integer.parseInt(r[j]);
	            int b=Integer.parseInt(r[j+1]);
	            if(a>b){
	                String t=r[j];
	                String tp=arr[j];
	                r[j]=r[j+1];
	                arr[j]=arr[j+1];
	                r[j+1]=t;
	                arr[j+1]=tp;
	                
	            }
	            
	        }
	    }
	    for(int i=0;i<n;i++){
	    System.out.print(arr[i]+" ");
	    }
	}
}
